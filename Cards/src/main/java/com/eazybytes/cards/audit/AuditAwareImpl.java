package com.eazybytes.cards.audit;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;



/*

 Whenever we use the parameter
    @CreatedBy
    @CreatedBy
    and many more
    Here is a problem that the SpringFramework can get the Date-Time from either the server or the LocalMachine
& it doesnot have any clue who is updating the data

            --> for the same we create a class AuditAwareImpl in package audit
            --> Which makes sure who is the current auditor


            Inside this class we mention who is the current auditor

*/
public class AuditAwareImpl implements AuditorAware<String> {


    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("CARDS_MS");
    }
}
