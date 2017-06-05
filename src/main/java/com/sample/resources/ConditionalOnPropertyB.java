package com.sample.resources;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@ConditionalOnProperty(name = "SPRINGBOOT_CONDITION_B", havingValue = "true", matchIfMissing = true)
@Component
public class ConditionalOnPropertyB {

  public String getValue() {
    return "ConditionalB";
  }

}
