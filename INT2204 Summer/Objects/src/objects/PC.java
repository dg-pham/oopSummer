/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author Go Eun Sung
 */
public class PC {

    private String cpu, gpu, main, vga, monitor;
    private int ram;

    //Getter & Setter
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getVga() {
        return vga;
    }

    public void setVga(String vga) {
        this.vga = vga;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram > 0) {
            this.ram = ram;
        }
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    //Constructor
    public PC(String cpu, String gpu, String main, String vga, int ram, String monitor) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.main = main;
        this.vga = vga;
        this.ram = ram;
        this.monitor = monitor;
    }

    //get info
    public void showInfo() {
        System.out.println("cpu: " + this.getCpu());
        System.out.println("gpu: " + this.getGpu());
        System.out.println("main: " + this.getMain());
        System.out.println("vga: " + this.getVga());
        System.out.println("ram: " + this.getRam());
        System.out.println("monitor: " + this.getMonitor());
    }

    //upgrade ram
    public void upRam(int a) {
        if (a > 0) {
            this.setRam(this.getRam() + a);
        } else {
            System.out.println("can't upgrade");
        }
    }
}
