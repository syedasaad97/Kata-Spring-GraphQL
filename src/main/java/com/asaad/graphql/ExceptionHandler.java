package com.asaad.graphql;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.stereotype.Component;

@Component
public class ExceptionHandler extends DataFetcherExceptionResolverAdapter {

    @Override
    protected GraphQLError resolveToSingleError(Throwable ex, DataFetchingEnvironment env) {
        ErrorType errorType = null;
        if(ex instanceof DataIntegrityViolationException){
            errorType = ErrorType.ValidationError;
        }else{
            errorType = ErrorType.ExecutionAborted;
        }
        return GraphQLError.newError()
                .message("Error :" + ex.getMessage())
                .errorType(errorType)
                .build();
    }
}
