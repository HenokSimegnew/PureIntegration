package com.PureIntegration.PureIntegration.Service;

import com.PureIntegration.PureIntegration.Model.Breeds;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class BreedsService {
    public Object getBreedsJsonData(){
        try {
            File file = new File("breeds.json");
            ObjectMapper mapper = new ObjectMapper();
            Object breedsObject = mapper.readValue(file, Object.class);
            Breeds breeds = new Breeds(breedsObject);
            breeds.setStatus("success");
            return  breeds;
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        finally {
        }
        return  null;
    }
}
