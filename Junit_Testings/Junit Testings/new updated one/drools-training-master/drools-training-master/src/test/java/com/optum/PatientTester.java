package com.optum;


import com.optum.model.Patient;
import com.optum.model.PatientDisease;
import org.junit.jupiter.api.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieSession;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientTester {
    static Map<Integer,Patientd> map= new HashMap<>();

    static  {
        //Variable for Timeframe
        LocalDate validDate = LocalDate.of(2022, 06, 30);
        //Variable for DOB
        LocalDate DOB = LocalDate.of(2000, 9, 04);

        map.put(1,new Patientd(Arrays.asList(
                new Patient(1,"R13.1", "Active", validDate, DOB)),
                new MapCreator(Arrays.asList(new Pair(1, "Dysphagia"))),
                new MapCreator(Arrays.asList(new Pair(1)))));

        map.put(2,new Patientd(Arrays.asList(
                new Patient(2,"R63.4", "Active", validDate, DOB)),
                new MapCreator(Arrays.asList(new Pair(2, "Weight Loss"))),
                new MapCreator(Arrays.asList(new Pair(2)))));

        map.put(3,new Patientd(Arrays.asList(
                new Patient(3,"R68.81", "Active", validDate, DOB)),
                new MapCreator(Arrays.asList(new Pair(3, "Early Satiety"))),
                new MapCreator(Arrays.asList(new Pair(3)))));

        map.put(4,new Patientd(Arrays.asList(
                new Patient(4,"K21.0", "Active", validDate, DOB)),
                new MapCreator(Arrays.asList(new Pair(4,"GERD"))),
                new MapCreator(Arrays.asList(new Pair(4)))));

        map.put(5,new Patientd(Arrays.asList(
                new Patient(5,"D50.8", "Active", validDate, DOB)),
                new MapCreator(Arrays.asList(new Pair(5, "Iron Deficiency"))),
                new MapCreator(Arrays.asList(new Pair(5)))));

        map.put(6,new Patientd(Arrays.asList(
                new Patient(6,"T85.521A", "Active", validDate, DOB)),
                new MapCreator(Arrays.asList(new Pair(6, "Chronic Heartburn"))),
                new MapCreator(Arrays.asList(new Pair(6)))));

        map.put(7,new Patientd(Arrays.asList(
                new Patient(7,"R68.81", "Active", validDate, DOB)),
                new MapCreator(Arrays.asList(new Pair(7, "Early Satiety"))),
                new MapCreator(Arrays.asList(new Pair(7)))));

        map.put(8,new Patientd(Arrays.asList(
                new Patient(8,"R68.81", "Active", validDate, DOB)),
                new MapCreator(Arrays.asList(new Pair(8, "Early Satiety"))),
                new MapCreator(Arrays.asList(new Pair(8)))));

        map.put(9,new Patientd(Arrays.asList(
                new Patient(9,"R13.1", "Inactive", validDate, DOB)),
                new MapCreator(Arrays.asList(new Pair(9, null))),
                new MapCreator(Arrays.asList(new Pair(9)))));

        map.put(10,new Patientd(Arrays.asList(
                new Patient(10,"R13.1", "Active", LocalDate.of(2021, 06, 30), DOB)),
                new MapCreator(Arrays.asList(new Pair(10, null))),
                new MapCreator(Arrays.asList(new Pair(10)))));

        map.put(11,new Patientd(Arrays.asList(
                new Patient(11,"R63.4", "Active", LocalDate.of(2021, 06, 30), DOB)),
                new MapCreator(Arrays.asList(new Pair(11, null))),
                new MapCreator(Arrays.asList(new Pair(11)))));

        map.put(12,new Patientd(Arrays.asList(
                new Patient(12,"R63.4", "Inactive", validDate, DOB)),
                new MapCreator(Arrays.asList(new Pair(12, null))),
                new MapCreator(Arrays.asList(new Pair(12)))));

        map.put(13,new Patientd(Arrays.asList(
                new Patient(12,"R68.81", "Inactive", validDate, DOB)),
                new MapCreator(Arrays.asList(new Pair(13, null))),
                new MapCreator(Arrays.asList(new Pair(13)))));

        map.put(14,new Patientd(Arrays.asList(
                new Patient(14,"R68.81", "Active", LocalDate.of(2021, 06, 30), DOB)),
                new MapCreator(Arrays.asList(new Pair(14, null))),
                new MapCreator(Arrays.asList(new Pair(14)))));

        map.put(15,new Patientd(Arrays.asList(
                new Patient(15,"D50.8", "Active", LocalDate.of(2021, 06, 30), DOB)),
                new MapCreator(Arrays.asList(new Pair(15, null))),
                new MapCreator(Arrays.asList(new Pair(15)))));

        map.put(16,new Patientd(Arrays.asList(
                new Patient(16,"D50.8", "Inactive", validDate, DOB)),
                new MapCreator(Arrays.asList(new Pair(16, null))),
                new MapCreator(Arrays.asList(new Pair(16)))));

        map.put(17,new Patientd(Arrays.asList(
                new Patient(17,"K21.0", "Active", LocalDate.of(2021, 06, 30), DOB)),
                new MapCreator(Arrays.asList(new Pair(17, null))),
                new MapCreator(Arrays.asList(new Pair(17)))));

        map.put(18,new Patientd(Arrays.asList(
                new Patient(18,"K21.0", "Inactive", validDate, DOB)),
                new MapCreator(Arrays.asList(new Pair(18, null))),
                new MapCreator(Arrays.asList(new Pair(18)))));

        map.put(19,new Patientd(Arrays.asList(
                new Patient(19,"T85.521A", "Active", LocalDate.of(2021, 06, 30), DOB)),
                new MapCreator(Arrays.asList(new Pair(19, null))),
                new MapCreator(Arrays.asList(new Pair(19)))));

        map.put(20,new Patientd(Arrays.asList(
                new Patient(20,"T85.521A", "Inactive", validDate, DOB)),
                new MapCreator(Arrays.asList(new Pair(20, null))),
                new MapCreator(Arrays.asList(new Pair(20)))));

        map.put(21,new Patientd(Arrays.asList(
                new Patient(21,"T85.521A", "Active", validDate, DOB),
                new Patient(21,"K21.0", "Active", validDate, DOB)),
                new MapCreator(Arrays.asList(new Pair(21, "Chronic Heartburn", "GERD"))),
                new MapCreator(Arrays.asList(new Pair(21)))));

        map.put(22,new Patientd(Arrays.asList(
                new Patient(22,"K40", "Active", validDate, DOB),
                new Patient(22,"K21.0", "Active", validDate, DOB)),
                new MapCreator(Arrays.asList(new Pair(22,  "GERD"))),
                new MapCreator(Arrays.asList(new Pair(22, "Hiatal Hernia")))));

        map.put(23,new Patientd(Arrays.asList(
                new Patient(23,"K40", "Active", validDate, DOB),
                new Patient(23,"K21.0", "Inactive", validDate, DOB)),
                new MapCreator(Arrays.asList(new Pair(23,  null))),
                new MapCreator(Arrays.asList(new Pair(23, null)))));

        map.put(24,new Patientd(Arrays.asList(
                //new Patient(24,"K40", "Active", validDate, DOB),
                new Patient(24,"K21.0", "Active", LocalDate.of(2022, 06, 30), DOB),
                new Patient(24,"K40", "Active", validDate, DOB)),
                new MapCreator(Arrays.asList(new Pair(24,  "GERD"))),
                new MapCreator(Arrays.asList(new Pair(24, "Hiatal Hernia")))));
    }

    @Test
    public void testForPatientDisease() {
        PatientTester pt= new PatientTester();
        PatientDisease patientDisease = new PatientDisease();
        KieSession kieSession = KieServices.Factory.get().getKieClasspathContainer().newKieSession("diseaserules");
        for (int tid : map.keySet()) {
            for(Patient p:map.get(tid).pt) {
                kieSession.insert(p);
            }
        }
        kieSession.insert(LocalDate.now());
        kieSession.insert(patientDisease);
        kieSession.fireAllRules();
        kieSession.dispose();
        for(int tid:map.keySet())
        {
            pt.validatorDisease(patientDisease, map.get(tid).dismp, map.get(tid).riskmp);
        }

    }

    public void validatorDisease(PatientDisease pd,MapCreator disease, MapCreator risk){

                  for(int pid:disease.map.keySet())
                  {
                      if (pd.getMaplist().get(pd.getPatient(pid))==null){
                          assertEquals(0,disease.map.get(pid).size());
                      }
                      else {
                          assertEquals(pd.getMaplist().get(pd.getPatient(pid)), (disease.map.get(pid)));
                          System.out.println("Patient with id "+pd.getPatient(pid).getId()+" has disease "+pd.getMaplist().get(pd.getPatient(pid))+" and");
                          if (pd.getPatient(pid).getRisk().size()!=0) {
                              System.out.println("Risk Factor "+pd.getPatient(pid).getRisk());
                          }
                      }
                  }

                    for(int pid:risk.map.keySet()) {
                        if (pd.getPatient(pid) == null) {
                            assertEquals(0, risk.map.get(pid).size());
                        } else {
                            if (pd.getPatient(pid).getRisk().size() == 0) {
                                assertEquals(0, risk.map.get(pid).size());
                            } else {
                                assertEquals(pd.getPatient(pid).getRisk(), risk.map.get(pid));
                               //system.out.println("Patient with id has disease "+pd.getPatient(pid).getId()+" has risk "+pd.getPatient(pid).getRisk());
                            }
                        }
                    }

    }
}
