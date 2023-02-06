//Adding database

package com.moodfulFinal.moodfulWebsite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

    public List<Provider> allProviders() {
        return providerRepository.findAll();

    }
    
}
