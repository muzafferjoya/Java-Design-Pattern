
package com.khan.abstractfactory;

/**
 * 
 * KingdomFactory factory interface.
 * 
 */
public interface KingdomFactory {

  Castle createCastle();

  King createKing();

  Army createArmy();

}
