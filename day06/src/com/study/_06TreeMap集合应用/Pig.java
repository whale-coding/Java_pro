package com.study._06TreeMap集合应用;

import java.util.Objects;

/**
 * @Classname: Pig
 * @Date: 2024/5/31 09:56
 * @Author: 聂建强
 * @Description:
 */
public class Pig implements Comparable{
    private String name;
    private double price ;
    private double weight;

    public Pig() {
    }

    public Pig(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pig pig = (Pig) o;
        return Double.compare(price, pig.price) == 0 && Double.compare(weight, pig.weight) == 0 && Objects.equals(name, pig.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, weight);
    }

    /**
     *  比较者： this 被比较者： o  需求：按照价格排序！
     * @param o the object to be compared.
     * @return 正数、负数或0
     */
    @Override
    public int compareTo(Object o) {
        // 浮点型的大小比较建议使用Java自己的API: public static int compare(double d1, double d2)
        return -Double.compare(this.price, ((Pig)o).price);
    }
}
