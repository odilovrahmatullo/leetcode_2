package main;

public record DistrictOldValueDto(String name, String oldCode) {

    @Override
    public String toString() {
        return "DistrictOldValueDto{name='" + name + "', oldCode='" + oldCode + "'}";
    }
}
