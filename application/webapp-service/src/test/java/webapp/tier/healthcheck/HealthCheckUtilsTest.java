package webapp.tier.healthcheck;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.eclipse.microprofile.health.HealthCheckResponse.State;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class HealthCheckUtilsTest {

	@Test
	void respHealthCheckStatusDown() {
		assertThat(HealthCheckUtils.respHealthCheckStatus(false, "Test").getState(), is(State.DOWN));
	}

	@Test
	void respHealthCheckStatusUp() throws IOException, TimeoutException {
		assertThat(HealthCheckUtils.respHealthCheckStatus(true, "Test").getState(), is(State.UP));
	}

}