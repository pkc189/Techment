package com.ticket.dao;

import com.ticket.model.Train;

public interface TrainDao {

   public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
   public static final String URL = "jdbc:mysql://localhost:5000/ticket?autoReconnect=true&useSSL=false";
   public static final String USERNAME = "root";
   public static final String PASSWORD = "Bodygaurd@2013";
   
   public Train findTrain(int trainNo);
   
  }

