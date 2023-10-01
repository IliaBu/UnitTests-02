package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class VehicleTest {

    Car auto = new Car("Ford", "Kuga", 2020);
    Motorcycle moto = new Motorcycle("Racer", "Ranger", 2016);

    //- проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    void instanceOf() {
        assertThat(auto instanceof Vehicle);
    }

    //- проверка того, объект Car создается с 4-мя колесами
    @Test
    void WheelsCar() {
        assertThat(auto.getNumWheels()).isEqualTo(4);
    }

    // - проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    void MotorcycleWheels() {
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }

    //- проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void testDriveCar() {
        auto.testDrive();
        assertThat(auto.getSpeed()).isEqualTo(60);
    }

    // - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    void testDriveMotorcycle() {
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }

    //- проверить, что в режиме парковки (сначала testDrive, потом park,
    // т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    void parkCar() {
        auto.testDrive();
        auto.park();
        assertThat(auto.getSpeed()).isEqualTo(0);
    }

    //- проверить, что в режиме парковки (сначала testDrive, потом park
    // т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    void parkMotorcycle() {
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }

}