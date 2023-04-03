# System Design task
## Task: 
Design framework/approach which will cover all parts for testing of micro-frontend web-application with backend microservices.
It should include necessary quality gates, tools and automation solutions.

## Solution:
### Testing types and scope
The testing types may include functional, performance, security and integration tests.
Scope of the functional testing should cover each micro-frontend component one by one. 
But it is also required to focus on critical path or happy path testing since the main goal of an application is to work correctly, not to check that every single component is working separately. 
Smoke tests could be added as a gate criteria for CI pipelines. 
Testing should cover both API and UI. Usually I start with the backend first approach.
Performance testing required based on SUT description about average loading time and amount of requests per second. 
It could vary from several tools, I worked with JMeter, Gatling, Chaos Monkey.
Security testing is needed, but it depends on application security requirements.
Integration testing is vital for micro-frontend components since each component has integrations with others and implements API microservice. 
Such communication could be pretty difficult and could require contract testing to define contracts between all components. 
In that way services should be mocked to test interactions between consumers and producers.

### Testing environment
Nice to have dev/test/integration environments. Good to have ability to deploy/run/check each component independently for testing purposes, for example with using StoryBook.
### Test data
Based on real needs test data could be stored in database, scenarios, external files: json, tables or could be generated: property based testing vs example based testing.
### Choosing tools and frameworks
For testing UI applications we could consider several UI testing frameworks, such as: Selenium, Playwright, Cypress, etc. 
Each framework has their own pros and cons or limitations. For the final decision we could investigate main qualities for our testing, for example: list of supported browsers, need to automate API calls in the same framework without additional libraries, programming language of our automation team, etc. 
But based on the existing team it possibly be Java, TypeScript or Python. Besides that as I know both Playwright, Cypress support GraphQL API: for example, you can write a test case that submits a GraphQL query through the frontend UI and verifies that the response matches the expected output.
If we reduce the number of frameworks not to only one framework then we could try several approaches and create POC for each to automate several high priority or difficult for automation scenarios and compare.
### CI/CD
One of the requirements is to have the ability to run tests in CI/CD pipelines. We could use any: like Bamboo, Jenkins. 
Depending on our tests we could have gate criteria for dev pipelines: 100% passed unit tests, contact tests and smoke. 
Running detailed component tests, integration and e2e could be a separate job with schedule. 
It could be required to add tags like: @smoke, @module, @priority and etc, to be able to run only the needed set of test scenarios.
### Developing test cases and test scenarios
One of the key questions in writing scenarios - should we write it in a single repository or to have a separate repository for each component. 
It also has both pros and cons, but one of the solutions that I used in my last project was to create a shared framework with common methods and utils, template project. 
Then each team could easily start their own project by copying the template and add a dependency for a shared framework.
### Shift left approach
Based on our dev team size, experience and etc. one of the ways to increase the quality of the product is to cover testing from the beginning: write unit tests, ask the QA team to be involved in discussions and help dev teams to define test cases, test requirements before actual coding. 
Integration testing in such a way could be done by dev team using contract testing approach and QA team could focus on testing user scenarios, component testing, integration testing with third party and e2e.
### Reporting
Traditional way of reporting is to add Allure reporting as a dependency to the testing framework. 
It could be done both for UI and API testing. Allure supported converting html reports to json or PDF files if needed.

