package cn.iocoder.yudao.module.infra.enums.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 数据库类型枚举
 */
@Getter
@AllArgsConstructor
public enum DatabaseTypeEnum {
    MYSQL("mysql"),
    SQLSERVER("sqlserver"),
    ORACLE("oracle"),
    POSTGRESQL("postgresql"),
    DM("dm"),
    KINGBASE("kingbase"),
    MONGODB("mongodb");

    private final String type;
}
