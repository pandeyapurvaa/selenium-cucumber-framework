package com.utils;

public class TestContext {
    private final DriverFactory driverFactory;

    public TestContext() {
        driverFactory = new DriverFactory();
    }

    public DriverFactory getDriverFactory() {
        return driverFactory;
    }
}
