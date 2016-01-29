package com.lambdaworks.redis.api.rx;

import java.util.List;
import rx.Observable;

/**
 * Observable commands for Transactions.
 * 
 * @param <K> Key type.
 * @param <V> Value type.
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 * @since 4.0
 * @generated by com.lambdaworks.apigenerator.CreateReactiveApi
 */
public interface RedisTransactionalReactiveCommands<K, V> {

    /**
     * Discard all commands issued after MULTI.
     * 
     * @return String simple-string-reply always {@code OK}.
     */
    Observable<String> discard();

    /**
     * Execute all commands issued after MULTI.
     *
     * @return Object array-reply each element being the reply to each of the commands in the atomic transaction.
     *
     *         When using {@code WATCH}, {@code EXEC} can return a
     */
    Observable<Object> exec();

    /**
     * Mark the start of a transaction block.
     *
     * @return String simple-string-reply always {@code OK}.
     */
    Observable<String> multi();

    /**
     * Watch the given keys to determine execution of the MULTI/EXEC block.
     *
     * @param keys the key
     * @return String simple-string-reply always {@code OK}.
     */
    Observable<String> watch(K... keys);

    /**
     * Forget about all watched keys.
     *
     * @return String simple-string-reply always {@code OK}.
     */
    Observable<String> unwatch();
}
