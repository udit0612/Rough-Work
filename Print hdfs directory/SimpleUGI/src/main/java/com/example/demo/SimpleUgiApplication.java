package com.example.demo;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleUgiApplication {

	public static void main(String[] args) throws IOException {
		 System.setProperty("hadoop.home.dir", "C:\\Users\\DBR-1\\Downloads\\Microsoft.SkypeApp_kzf8qxf38zg5c!App\\All\\hadoop-winutils-2.6.0\\");
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS","hdfs://192.168.99.101:8020");
		FileSystem fs = FileSystem.get(conf);
		
		FileStatus[] fsStatus = fs.listStatus(new Path("/"));
		for(int i = 0; i < fsStatus.length; i++){
		   System.out.println(fsStatus[i].getPath().toString());
		}
		SpringApplication.run(SimpleUgiApplication.class, args);
	}

}
