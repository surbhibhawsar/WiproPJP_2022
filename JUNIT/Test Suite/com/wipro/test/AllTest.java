package com.wipro.test;
import com.wipro.task.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestStringConcat.class, TestSortValues.class, TestCheckPresence.class })
public class AllTest {

}
