package br.com.dio.persistence.entity;

import java.util.stream.Stream;

public enum OperationEnum {

    INSERT,
    UPDATE,
    DELETE;

    public static OperationEnum getByDBOperation(final String dbOperation){
        return Stream.of(OperationEnum.values())
                .filter(o -> o.name().startsWith(dbOperation.toUpperCase()))
                .findFirst()
                .orElseThrow();
    }

}
