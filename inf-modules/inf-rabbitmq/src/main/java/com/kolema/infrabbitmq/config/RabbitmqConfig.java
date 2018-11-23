package com.kolema.infrabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * rabbitmq config
 *
 * @author ware zhang
 * @date 2018/07/30
 */
@Configuration
public class RabbitmqConfig {

    /**
     * Direct Exchange queue (Default)
     */
    @Bean
    public Queue helloQueue() {
        return new Queue("helloQueue");
    }

    @Bean
    public Queue userQueue() {
        return new Queue("userQueue");
    }

    /**
     * Topic Exchange queue
     */
    @Bean
    public Queue queueMessage() {
        return new Queue("topic.message");
    }

    @Bean
    public Queue queueMessages() {
        return new Queue("topic.messages");
    }

    /**
     * Fanout Exchange queue
     */
    @Bean
    public Queue aMessage() {
        return new Queue("fanout.A");
    }

    @Bean
    public Queue bMessage() {
        return new Queue("fanout.B");
    }

    @Bean
    public Queue cMessage() {
        return new Queue("fanout.C");
    }

    /**
     * <pre>
     * topic exchange
     *      Exchange forwards messages to all queues in the same ROUTING_KEY matching pattern
     * </pre>
     *
     * @return
     */
    @Bean
    TopicExchange exchange() {
        return new TopicExchange("exchange");
    }

    /**
     * <pre>
     * fanout exchange
     *     Exchange forwards messages to all bound queues regardless of their ROUTING_KEY Settings
     * </pre>
     *
     * @return
     */
    @Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }

    /**
     * 将队列topic.message queue与exchange绑定，binding_key为topic.message,就是完全匹配
     *
     * @param queueMessage
     * @param exchange
     * @return
     */
    @Bean
    Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
    }

    /**
     * 将队列topic.messages与exchange绑定，binding_key为topic.#,模糊匹配
     *
     * @param queueMessages
     * @param exchange
     * @return
     */
    @Bean
    Binding bindingExchangeMessages(Queue queueMessages, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
    }

    @Bean
    Binding bindingExchangeA(Queue aMessage, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(aMessage).to(fanoutExchange);
    }

    @Bean
    Binding bindingExchangeB(Queue bMessage, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(bMessage).to(fanoutExchange);
    }

    @Bean
    Binding bindingExchangeC(Queue cMessage, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(cMessage).to(fanoutExchange);
    }

}
