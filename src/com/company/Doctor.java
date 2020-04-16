package com.company;
public interface Doctor {
  float dosageCalculation(float weight, int age, float koef);
  String getDischarge();
  double discount(int age);
}
