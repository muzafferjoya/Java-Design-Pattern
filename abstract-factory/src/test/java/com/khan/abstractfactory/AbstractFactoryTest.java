
package com.khan.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.khan.abstractfactory.App.FactoryMaker;
import com.khan.abstractfactory.App.FactoryMaker.KingdomType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test for abstract factory
 */
public class AbstractFactoryTest {

  private App app = new App();
  private KingdomFactory elfFactory;
  private KingdomFactory orcFactory;

  @BeforeEach
  public void setUp() {
    elfFactory = FactoryMaker.makeFactory(KingdomType.ELF);
    orcFactory = FactoryMaker.makeFactory(KingdomType.ORC);
  }

  @Test
  public void king() {
    final King elfKing = app.getKing(elfFactory);
    assertTrue(elfKing instanceof ElfKing);
    assertEquals(ElfKing.DESCRIPTION, elfKing.getDescription());
    final King orcKing = app.getKing(orcFactory);
    assertTrue(orcKing instanceof OrcKing);
    assertEquals(OrcKing.DESCRIPTION, orcKing.getDescription());
  }

  @Test
  public void castle() {
    final Castle elfCastle = app.getCastle(elfFactory);
    assertTrue(elfCastle instanceof ElfCastle);
    assertEquals(ElfCastle.DESCRIPTION, elfCastle.getDescription());
    final Castle orcCastle = app.getCastle(orcFactory);
    assertTrue(orcCastle instanceof OrcCastle);
    assertEquals(OrcCastle.DESCRIPTION, orcCastle.getDescription());
  }

  @Test
  public void army() {
    final Army elfArmy = app.getArmy(elfFactory);
    assertTrue(elfArmy instanceof ElfArmy);
    assertEquals(ElfArmy.DESCRIPTION, elfArmy.getDescription());
    final Army orcArmy = app.getArmy(orcFactory);
    assertTrue(orcArmy instanceof OrcArmy);
    assertEquals(OrcArmy.DESCRIPTION, orcArmy.getDescription());
  }

  @Test
  public void createElfKingdom() {
    app.createKingdom(elfFactory);
    final King king = app.getKing();
    final Castle castle = app.getCastle();
    final Army army = app.getArmy();
    assertTrue(king instanceof ElfKing);
    assertEquals(ElfKing.DESCRIPTION, king.getDescription());
    assertTrue(castle instanceof ElfCastle);
    assertEquals(ElfCastle.DESCRIPTION, castle.getDescription());
    assertTrue(army instanceof ElfArmy);
    assertEquals(ElfArmy.DESCRIPTION, army.getDescription());
  }

  @Test
  public void createOrcKingdom() {
    app.createKingdom(orcFactory);
    final King king = app.getKing();
    final Castle castle = app.getCastle();
    final Army army = app.getArmy();
    assertTrue(king instanceof OrcKing);
    assertEquals(OrcKing.DESCRIPTION, king.getDescription());
    assertTrue(castle instanceof OrcCastle);
    assertEquals(OrcCastle.DESCRIPTION, castle.getDescription());
    assertTrue(army instanceof OrcArmy);
    assertEquals(OrcArmy.DESCRIPTION, army.getDescription());
  }
}
