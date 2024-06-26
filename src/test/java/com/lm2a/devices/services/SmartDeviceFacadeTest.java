package com.lm2a.devices.services;


import com.lm2a.devices.domain.SmartDevice;
import com.lm2a.devices.domain.SmartPhone;
import com.lm2a.devices.domain.SmartWatch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartDeviceFacadeTest {

    @Test
    void createSmartPhone() {
        SmartDevice result = SmartDeviceFacade.createSmartPhone();

        assertNotNull(result);
        assertNotNull(result.getCpu());
        assertTrue(result.getCpu().getOn());
        assertNotNull(result.getRam());
        assertNotNull(result.getBattery());

        // smartphone
        // instanceof permite saber si un objeto es una instacia de una clase
        assertTrue(result instanceof SmartPhone);
        assertFalse(result instanceof SmartWatch);

        SmartPhone smartphone = (SmartPhone) result;
        assertNotNull(smartphone.getCamera());


    }

    @Test
    void createSmartWatch() {

        SmartDevice result = SmartDeviceFacade.createSmartWatch();

        assertNotNull(result);
        assertNotNull(result.getCpu());
        assertFalse(result.getCpu().getOn());
        assertNotNull(result.getRam());
        assertNotNull(result.getBattery());

        SmartWatch reloj = (SmartWatch) result;
        assertNotNull(reloj.getMonitor());
    }
}