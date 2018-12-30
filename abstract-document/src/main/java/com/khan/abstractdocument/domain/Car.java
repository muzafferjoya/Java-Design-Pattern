
package com.khan.abstractdocument.domain;

import java.util.Map;

import com.khan.abstractdocument.AbstractDocument;

/**
 * Car entity
 */
public class Car extends AbstractDocument implements HasModel, HasPrice, HasParts {

  public Car(Map<String, Object> properties) {
    super(properties);
  }

}
