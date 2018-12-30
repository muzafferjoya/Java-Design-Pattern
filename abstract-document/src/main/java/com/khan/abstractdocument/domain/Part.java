
package com.khan.abstractdocument.domain;

import java.util.Map;

import com.khan.abstractdocument.AbstractDocument;

/**
 * Part entity
 */
public class Part extends AbstractDocument implements HasType, HasModel, HasPrice {

  public Part(Map<String, Object> properties) {
    super(properties);
  }

}
