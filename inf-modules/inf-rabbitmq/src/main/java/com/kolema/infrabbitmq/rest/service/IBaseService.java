package com.kolema.infrabbitmq.rest.service;

/**
 * rabbitmq base use service
 *
 * @author ware zhang
 * @date 2018/07/30
 */
public interface IBaseService {

    /**
     * produce to rabbitmq producer queue
     */
    void produce();

    /**
     * consume from rabbitmq consumer queue
     */
    void consume();

}
