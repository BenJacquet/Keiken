Imagine a full month of a team working in agile building an accounting Software
Very specific to their line of business (Space industry), with their specificities:

The organisation outside of the Agile team building the application: Accounting team, the other IT team (Security, oprations, …) , a thirdparty software provider that offers a needed Service as an API, the CEO of the company that sponsors the project, the legal team that needs to make sure the reports genrated by the tool are compliant to the IFRS regulations, Space engineers.

## Us
- Agile Team building the application

## Actors:
- Accounting team
- Other IT Team (SecOps)
- Thirdparty software provider (for service as an API)
- CEO of the company (sponsors the project)
- Legal team (Makes sure the reports generated are compliant to the IFRS)
- Space Engineers

## Constraints:
- Different Agile Software roles
- A limited Budget
- An existing application that the users appreciate, but not respecting the legal norms, and could cause a huge fine to the company.

# Questions
## What will be a typical Sprint Activities for these teams : A Regular Day, with all the rituals + The special days of the spring.

Let's say the sprint takes five days:

<b>First Iteration</b>
- Monday: Sprint Planning
- Tuesday: Daily Standup
- Wednesday: Daily Standup
- Thursday: Backlog Refinement
- Friday: Daily Standup

<b>Second Iteration</b>
- Monday: Daily Standup => Sprint Review => Sprint Retrospective
- Tuesday: Daily Standup
- Wednesday: Daily Standup
- Thursday: Backlog Refinement
- Friday: Daily Standup

## What will be the different roles needed in this team? how big should it be?
Each team must be represented

- Scrum Master: Responsible for ensuring that the team follows Agile practices, facilitating the Scrum events, and removing any obstacles that may prevent the team from achieving its goals.

- Product Owner: Responsible for defining and prioritizing the product backlog, ensuring that the team is building the right product, and making sure that the product meets the business objectives.

- Developers: Responsible for designing, coding, and testing the software according to the requirements specified in the product backlog.

- UI/UX Designer: Responsible for imagining the best user experience and user interface to make sure our application is aesthetically pleasing.

- Security Team Member: Responsible for ensuring that the software is secure and meets the necessary security standards.

- Accountant: Responsible for providing domain knowledge about the accounting processes and requirements, and ensuring that the software meets the needs of the Accounting team.

- Legal Team Member: Responsible for providing domain knowledge about the legal requirements and regulations, and ensuring that the software generates compliant reports according to the IFRS standards.

- Space Engineer: Responsible for providing domain knowledge about the space engineering industry and ensuring that the software meets the needs of the Space Engineers.

- Tester: Responsible for testing the software to ensure that it meets the requirements and specifications, and reporting any defects to the development team.

The size of the team is reasonable and should be sufficient for building the application with Agile methodology. However, it's important to note that the actual size of the team may depend on the scope and complexity of the project, as well as the available resources and budget.

The Product Owner will be in charge of reporting to the CEO

## Imagine their backlog: 10 fake Tasks large enough to be handled by different roles and linked to building this accounting app for space industry:

### Functional Design

### UI Design

### Technical Design

### Front End Dev

### Service Dev

### Test

### Deployement

<b>Task 1</b>: Create functional design documents for the accounting application, detailing the user stories, requirements, and acceptance criteria.

Responsible roles: Product Owner, Scrum Master, Front End Developer, Service Developer

<b>Task 2</b>: Design the user interface (UI) for the accounting application, ensuring that it is user-friendly, visually appealing, and meets the needs of the users.

Responsible roles: UX Designer, Front End Developer

<b>Task 3</b>: Create the technical design for the accounting application, outlining the architecture, infrastructure, and technologies that will be used.

Responsible roles: Technical Design, Service Developer

<b>Task 4</b>: Develop the front-end of the accounting application, using the design and functional specifications to create a user interface that is responsive, functional, and meets the user's needs.

Responsible roles: Front End Developer, UX Designer

<b>Task 5</b>: Develop the backend services for the accounting application, using third-party APIs as necessary, and ensuring that they are secure, scalable, and meet the needs of the users.

Responsible roles: Service Developer, Security Team Member

<b>Task 6</b>: Create a comprehensive test plan for the accounting application, outlining the test cases, scenarios, and criteria for testing.

Responsible roles: Tester, Product Owner, Front End Developer, Service Developer, Technical Design

<b>Task 7</b>: Conduct functional, integration, and acceptance testing for the accounting application, using the test plan to verify that the application meets the requirements and specifications.

Responsible roles: Tester, Front End Developer, Service Developer, Technical Design

<b>Task 8</b>: Deploy the accounting application to a production environment, ensuring that it is stable, scalable, and meets the security and compliance requirements.

Responsible roles: Deployment, Security Team Member

<b>Task 9</b>: Conduct user acceptance testing for the accounting application, using feedback from the users to improve the application's usability, functionality, and performance.

Responsible roles: Product Owner, UI/UX Designer, Tester

<b>Task 10</b>: Implement user authentication and authorization, to ensure that users only have access to the appropriate features and data

Responsible roles: Front End Developer, Service Developer, Security Team Member


## Try to fill all the elements of one of these task? What will compose this task? Will it have subtasks?

Task: Implement user authentication and authorization

- Determine the authentication and authorization requirements for the accounting application, including which user roles require access to which features and data.

- Choose an appropriate authentication and authorization mechanism for the accounting application, such as username/password, two-factor authentication, or single sign-on (SSO).

- Develop the authentication and authorization logic for the accounting application, including handling login, logout, password reset, and user management functions.

- Ensure that the authentication and authorization logic is secure, reliable, and scalable, and meets the necessary security standards, such as data encryption, secure session management, and protection against common attacks (e.g., cross-site scripting, SQL injection).

- Test the authentication and authorization logic thoroughly, including unit tests, integration tests, and end-to-end tests, to ensure that it works correctly and meets the requirements.

- Provide documentation and training to the users of the accounting application on how to use the authentication and authorization features, including best practices for password management and access control.

### By breaking down the task into smaller elements, it becomes easier to manage the development process and ensure that the authentication and authorization features are implemented correctly and meet the requirements.

## Will the subtasks have subtasks themselves? 

Of course these tasks are going to have subtasks.

Let's take "Choose an appropriate authentication and authorization mechanism":

This task will (non exhaustively) imply:
- Researching on the different authorization and authentication mechanisms.
- Deciding which mechanisms fit our needs
- Implementing the corresponding solution into our solution.

## How can the team follow their progress ?
By checking the <b>Board</b> and during the <b>Daily Standup</b>

## How can the team share about their problems and blocking challenges?
During the <b>Daily Standup</b>

## How can the team plan the first deployment.

- Identify the deployment environment (Private Cloud or Public Cloud for example)
- Define the deployment process (Creating an adapted pipeline)
- Identify deployment risks and mitigation strategies (Backups)
- Determine when the deployment will take place (Working hours are important)
- Conduct the deployment (Monitor the process)
- Tests after the deployment (Test that everything works as intended and no security or functional issue arise)

## Create a Jira project with the 10 tickets that you thought about, and adapt the ticket workflow to the process you imagined for the team.

![jira sprint](./screenshots/JiraTest.png "jira sprint")

