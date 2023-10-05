package org.example.HW1;

public class DriverProfile extends WorkerProfile {
    private String drivingLicence;
    public DriverProfile(String name, Integer age, Integer salary, String drivingLicence) {
        super(name, age, salary);
        this.drivingLicence = drivingLicence;
    }

    @Override
    public String profileInfo() {
        return super.profileInfo() + " Лицензия: " + drivingLicence;
    }

    public String getDrivingLicence() {
        return drivingLicence;
    }
    public void setDrivingLicence(String drivingLicence) {
        this.drivingLicence = drivingLicence;
    }
}
