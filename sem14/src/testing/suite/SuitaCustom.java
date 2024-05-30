package testing.suite;


import model.PachetTuristic;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testing.PersoanaTests;
import testing.categorii.TesteErrorCondition;
import testing.categorii.TesteRange;

@RunWith(Categories.class)
@Suite.SuiteClasses({PersoanaTests.class})
@Categories.IncludeCategory(TesteErrorCondition.class)
@Categories.ExcludeCategory(TesteRange.class)
public class SuitaCustom {
}
