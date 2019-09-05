package jbehave;

import lombok.Getter;
import lombok.Setter;
import org.assertj.core.api.Assertions;
import org.jbehave.core.annotations.AsJson;
import org.jbehave.core.annotations.Given;

public class SampleScenarioSteps {

  @Given("Some json $json")
  public void givenSomeJson(final SampleJson sampleJson) {
    Assertions.assertThat(sampleJson).isNotNull();
  }

  @Setter
  @Getter
  @AsJson
  public static class SampleJson {
    private String a;
    private String b;
  }
}