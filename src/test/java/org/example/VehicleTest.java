package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class VehicleTest {

    Car auto = new Car("Ford", "Kuga", 2020);
    Motorcycle moto = new Motorcycle("Racer", "Ranger", 2016);

    //- �������� ����, ��� ��������� ������� Car ����� �������� ����������� ������������� ��������; (instanceof)
    @Test
    void instanceOf() {
        assertThat(auto instanceof Vehicle);
    }

    //- �������� ����, ������ Car ��������� � 4-�� ��������
    @Test
    void WheelsCar() {
        assertThat(auto.getNumWheels()).isEqualTo(4);
    }

    // - �������� ����, ������ Motorcycle ��������� � 2-�� ��������
    @Test
    void MotorcycleWheels() {
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }

    //- �������� ����, ������ Car ��������� �������� 60 � ������ ��������� �������� (testDrive())
    @Test
    void testDriveCar() {
        auto.testDrive();
        assertThat(auto.getSpeed()).isEqualTo(60);
    }

    // - �������� ����, ������ Motorcycle ��������� �������� 75 � ������ ��������� �������� (testDrive())
    @Test
    void testDriveMotorcycle() {
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }

    //- ���������, ��� � ������ �������� (������� testDrive, ����� park,
    // �.� �������� �������� ����������) ������ ��������������� (speed = 0)
    @Test
    void parkCar() {
        auto.testDrive();
        auto.park();
        assertThat(auto.getSpeed()).isEqualTo(0);
    }

    //- ���������, ��� � ������ �������� (������� testDrive, ����� park
    // �.� �������� �������� ����������) �������� ��������������� (speed = 0)
    @Test
    void parkMotorcycle() {
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }

}