package com.chainsys.doctor.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.chainsys.doctor.dao.AppointmentDao;

import com.chainsys.doctor.pojo.Appointment;

public class TestAppointments {
    public static void testInsertAppointments() {
        try {
            Appointment newapp = new Appointment();
            newapp.setApp_id(6);
            Calendar c1 = Calendar.getInstance();
            java.util.Date newDate = c1.getTime();
            newapp.setApp_date(newDate);
            newapp.setApp_id(100);
            newapp.setPatient_name("Ravi");
            newapp.setFees_Amounts(1000);
            newapp.setFees_collection("Standard");
            int result = AppointmentDao.insertAppointment(newapp);
            System.out.println("Record Inserted : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testUpdateAppointments() {
        try {
            Appointment oldapp = AppointmentDao.getAppointmentsByID(6);
            System.out.println("Appointment ID :" + oldapp.getApp_id() + "\n" + "Doctor ID :" + oldapp.getApp_id()
                    + "\n" + "Patient name : " + oldapp.getPatient_name());
            Calendar c1 = Calendar.getInstance();
            java.util.Date newDate = c1.getTime();
            oldapp.setApp_date(newDate);
            oldapp.setApp_id(102);
            oldapp.setPatient_name("sugumar");
            oldapp.setFees_Amounts(3000);
            oldapp.setFees_collection("high");
            int result = AppointmentDao.updateAppointment(oldapp);
            System.out.println("Record Updated : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testDeleteAppointment() {
        try {
            int result = AppointmentDao.deleteAppointment(6);
            System.out.println("Records Deleted :" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testGetAppointmentById() {
        try {
            Appointment app = AppointmentDao.getAppointmentsByID(1);
            System.out.println("Appointment ID :" + app.getApp_id() + " " + "Doctor ID :" + app.getApp_id() + " "
                    + "Patient name :" + app.getPatient_name());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testGetAllAppointment() {
        try {
            List<Appointment> allAppointments = AppointmentDao.getAllAppointments();
            Iterator<Appointment> docIterator = allAppointments.iterator();
            while (docIterator.hasNext()) {
                Appointment app = docIterator.next();
                System.out.println("Appointment ID :" + app.getApp_id() + "\n" + "Doctor ID :" + app.getApp_id() + "\n"
                        + "Patient name :" + app.getPatient_name());
                System.out.println("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}