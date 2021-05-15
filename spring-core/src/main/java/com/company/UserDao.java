package com.company;

public class UserDao {

    private DatabaseConfig databaseConfig;

    public DatabaseConfig getDatabaseConfig() {
        return databaseConfig;
    }

    public UserDao setDatabaseConfig(DatabaseConfig databaseConfig) {
        this.databaseConfig = databaseConfig;
        return this;
    }
}
