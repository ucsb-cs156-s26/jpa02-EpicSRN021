package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }
    @Test
public void equals_same_object_returns_true() {
    assertTrue(team.equals(team));
}

@Test
public void equals_different_type_returns_false() {
    assertFalse(team.equals("not a team"));
}

@Test
public void equals_same_name_and_members_returns_true() {
    Team t2 = new Team("test-team");
    assertTrue(team.equals(t2));
}

@Test
public void equals_different_name_returns_false() {
    Team t2 = new Team("different");
    assertFalse(team.equals(t2));
}

@Test
public void equals_different_members_returns_false() {
    Team t2 = new Team("test-team");
    t2.addMember("Alice");
    assertFalse(team.equals(t2));
}

@Test
public void hashCode_same_objects_equal() {
    Team t1 = new Team("test-team");
    Team t2 = new Team("test-team");

    assertEquals(t1.hashCode(), t2.hashCode());
}
}
