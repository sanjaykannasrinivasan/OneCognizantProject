*****************************************************PROJECT DESCRIPTION*****************************************************************

Problem Statement : Be.Cognizant HomePage Header View
1.Login into Be.cognizant
2.Verify the User Details


  
Detailed Description: Main Project

1.Login into Be.cognizant using valid credentials
2.Capture the user information
3.Click on each and every header and print list of every Header features
3.Click on Corporate Funtions and navigate to Legal& Corporate Affairs
4.Navigate and click on Ethics and Compliance
5.Verify whether it navigates to Ethics and Compliance page
6.Display all the contents from Ethics and Compliance page

Key Automation Scope:

Capturing the screenshot
Handling Different Browser Windows
Printing all the values in console
Data Driven approach
Generating Cucumber Reports and ExtentReports


**********************************************************STEPS TO EXECUTE*************************************************************

-unzip the folder
-On eclipse, goto file->import->select the maven->click on existing maven project->next->browse the location where u unzip the folder-> click on finish
-Now go to the TestRunner.java,do right click and run 
-Now the file will Execute and we get the expected output as shown below.

*******************************************************FILES DESCRIPTION**************************************************************

1.src/main/java -We are not using this folder
2.src/test/java- There are five packages in this folder.
-> factory:In this package there is one class BaseClass.java which we launch different browser using its own classes
->pageObjects - In this file,There are four Classes 
                 1)AccounValidation.java-To validate user information such as UserID and Username
                 2)BasePage.java-To refer current driver to PageFactory
                 3)EthicsAndCompliance.java-To get all the contents available in Ethics and Compliance page.
                 4)HeaderPage.java-To get all the headers in Be.Cognizant Home Page
->StepDefinitions- In this file,There are four Classes . It has been created for each scenario.
                 1)ValidationSteps.java-To validate user information such as UserID and Username by getting a method in PageObjects
                 2)Hooks.java-To get the screenshot of failed scenario.
                 3)EthicsAndComplianceSteps.java-To get all the contents available in Ethics and Compliance page by getting a method in PageObjects.
                 4)HeaderSteps.java-To get all the headers in Be.Cognizant Home Page by getting method in PageObjects.
->testRunner - Here we have TestRunner.java class where we do run and here we have also added features for generating cucumber report and extentreport.
->utilities- Here we have WriteExcelData.java- To print all the contents available in be.cognizant home page header and also prints all the contents available in the ethichs and compliance page.

3.src/test/resources- In this folder, We have three files 
                 1)config.properties-To get name of browser and URL to launch Be.Cognizant home page
                 2)extent.properties-To get all the properties for generating extentReport
                 3)testdata.xlsx-To store all the data which are getting printed in console.

4.JRE System Library: In this File we have all dependencies of JAR.files.         

5.Maven Dependencies: In this File we have all the directory on the local machine, where all the project artifacts are stored. when a Maven build is executed,
Maven automatically downloads all the dependency jars into the local repository. Usually, this directory is named.

6.FeatureFiles:In this folder we have three cucmber feature files
                1)f001_validation.feature-We have created a feature, scenario and actions to be performed to validate user information.
                2)f002_header.feature-We have created a feature, scenario and actions to be performed to get all the headers in Be.cognizant Home Page.
                3)f003_ethics.feature-We have created a feature, scenario and actions to be performed to get all the contents available in Ethics and Compliance page.

7.Report: In this folder the myreport.html is present which is the cucumber report of the project

8.src: In this, there are two folders
	-test:It is an empty folder

9.target: It is an empty folder
 
10.pom.xml: The pom.xml file contains information of project and configuration information for the maven to build the project such as dependencies,
build directory, source directory, test source directory, plugin, goals etc. Maven reads the pom.xml file, then executes the goal.

 
***************************************************************************************************************************************

                                                        OUTPUT ON CONSOLE

***************************************************************************************************************************************

@regression
Scenario: Successful validation of user details # FeatureFiles/f001_validation.feature:4
  Given user navigates beCognizant portal       # stepDefinitions.ValidationSteps.user_navigates_be_cognizant_portal()

    Embedding Successful validation of user details [image/png 269713 bytes]

  Then user click on myaccount menu             # stepDefinitions.ValidationSteps.user_click_on_myaccount_menu()

    Embedding Successful validation of user details [image/png 269813 bytes]


The user id of Employee is: userid@cognizant.com
The username of Employee is: LastName, FirstName (Cognizant)
  Then user should see user account details     # stepDefinitions.ValidationSteps.user_should_see_user_account_details()

    Embedding Successful validation of user details [image/png 282469 bytes]


@sanity @regression
Scenario: Getting data from header page of beCognizant portal             # FeatureFiles/f002_header.feature:4
  Given user navigates beCognizant portal                                 # stepDefinitions.ValidationSteps.user_navigates_be_cognizant_portal()

    Embedding Getting data from header page of beCognizant portal [image/png 241742 bytes]

  When user click on Company header                                       # stepDefinitions.HeaderSteps.user_click_on_company_header()

    Embedding Getting data from header page of beCognizant portal [image/png 286690 bytes]


All features present in Company header :
1. About Cognizant
2. Acronyms
3. Bluebolt
4. Brand Resources
5. Environmental Social Governance
6. Executive Committee
7. Executive Assistants
8. The Cognizant Agenda
9. Ravi Kumar S: A Journey of Growth
  Then user stores all header features displayed in Company header        # stepDefinitions.HeaderSteps.user_stores_all_header_features_displayed_in_company_header()

    Embedding Getting data from header page of beCognizant portal [image/png 256771 bytes]

  When user click on Service Lines                                        # stepDefinitions.HeaderSteps.user_click_on_service_lines()

    Embedding Getting data from header page of beCognizant portal [image/png 353970 bytes]


All features present in Service Lines header :
1. Service Lines Home
2. Core Technologies & Insights (CT&I)
    2.1. Artificial Intelligence & Analytics (AI&A)
    2.2. Internet of Things (IoT)
    2.3. Cloud, Infrastructure & Security (CIS)
    2.4. Sustainability Services
3. Enterprise Platform Services (EPS)
4. Industry Solutions Group (ISG)
5. Intuitive Operations & Automation (IOA)
6. Software & Platform Engineering (SPE)
    6.1. Application Development & Management (ADM)
    6.2. Digital Experience (DX)
    6.3. Digital Engineering (DE)
    6.4. Quality Engineering & Assurance (QEA)
7. Enablement: Application Lifecycle Management
8. Enablement: Project & Program Management
9. Enablement: Delivery Excellence
10. Enablement: Global Solution Architecture (GSA)
  Then user stores all header features displayed in Service Lines         # stepDefinitions.HeaderSteps.user_stores_all_header_features_displayed_in_service_lines()

    Embedding Getting data from header page of beCognizant portal [image/png 294501 bytes]

  When user click on Sales Resources                                      # stepDefinitions.HeaderSteps.user_click_on_sales_resources()

    Embedding Getting data from header page of beCognizant portal [image/png 304291 bytes]


All features present in Sales Resources header :
1. Case Studies
2. Global Partner Ecosystem
3. Global Sales and Consulting Education
4. Global Sales Operations
5. What We Sell
  Then user stores all header features displayed in Sales Resources       # stepDefinitions.HeaderSteps.user_stores_all_header_features_displayed_in_sales_resources()

    Embedding Getting data from header page of beCognizant portal [image/png 303575 bytes]

  When user click on Markets and Countries                                # stepDefinitions.HeaderSteps.user_click_on_markets_and_countries()

    Embedding Getting data from header page of beCognizant portal [image/png 299650 bytes]


All features present in Market and Countries header :
1. Americas
    1.1. Countries
      1.1.1.  Argentina
      1.1.2.  Brazil
      1.1.3.  Canada
      1.1.4.  Chile
      1.1.5.  Colombia
      1.1.6.  Costa Rica
      1.1.7.  Mexico
      1.1.8.  United States of America
    1.2. Products and Resources (P&R)
    1.3. Commercial Operations
2. Asia Pacific and Japan
    2.1. Australia
    2.2. China
    2.3. Hong Kong
    2.4. Indonesia
    2.5. Japan
    2.6. Malaysia
    2.7. New Zealand
    2.8. Philippines
    2.9. Singapore
    2.10. South Korea
3. Europe, the Middle East and Africa
    3.1. Countries (EMEA)
      3.1.1.  Belgium
      3.1.2.  Bulgaria
      3.1.3.  Czech Republic
      3.1.4.  Denmark
      3.1.5.  Finland
      3.1.6.  France
      3.1.7.  Germany
      3.1.8.  Hungary
      3.1.9.  Italy
      3.1.10.  Lithuania
      3.1.11.  Latvia
      3.1.12.  Netherlands
      3.1.13.  Norway
      3.1.14.  Portugal
      3.1.15.  Poland
      3.1.16.  Qatar
      3.1.17.  Saudi Arabia
      3.1.18.  Spain
      3.1.19.  Sweden
      3.1.20.  Switzerland
      3.1.21.  United Arab Emirates
      3.1.22.  United Kingdom and Ireland
    3.2. Central Europe Deal Management
4. Consulting
5. India
  Then user stores all header features displayed in Markets and Countries # stepDefinitions.HeaderSteps.user_stores_all_header_features_displayed_in_markets_and_countries()

    Embedding Getting data from header page of beCognizant portal [image/png 297393 bytes]

  When user click on Corporate Functions                                  # stepDefinitions.HeaderSteps.user_click_on_corporate_functions()

    Embedding Getting data from header page of beCognizant portal [image/png 299941 bytes]


All features present in Corporate Functions header :
1. Finance
    1.1. Client Audit Management (CAM)
    1.2. Client Scorecard
    1.3. Corporate Development
    1.4. Competitive and Market Intelligence
    1.5. Corporate Strategy
    1.6. Finance Academy
    1.7. Finance Global Procedures and Policies
    1.8. Global Pricing
    1.9. Project Cost Baseline
    1.10. Travel and Expense
2. Human Resources
3. Legal & Corporate Affairs
    3.1. Global Legal
    3.2. Ethics and Compliance
    3.3. Global Corporate Policies
    3.4. Global Privacy
    3.5. Procurement
    3.6. Corporate Real-Estate Workplace Services
       3.6.1. Global Environment Health and Safety
    3.7. Contract Lifecycle Risk Management
       3.7.1. CWW Contracting Assurance and Signature
       3.7.2. Dedicated Contract Commercial Management
       3.7.3. MyContracts
       3.7.4. Risk Based Contracting
       3.7.5. SOW Support Center
4. Marketing
    4.1. Analyst Relations
    4.2. Brand, Thought Leadership & Digital Marketing
    4.3. Brand Resources
    4.4. Client Experience
       4.4.1. Client Advocacy
       4.4.2. Client Briefings
       4.4.3. Client Insights
    4.5. Cognizant Research
    4.6. Communications
    4.7. Events and Sponsorships
    4.8. GGM Field Marketing
    4.9. Martech
    4.10. Social Media
    4.11. World Economic Forum
5. Security and Technology
    5.1. IT
    5.2. Corporate Security
  Then user stores all header features displayed in Corporate Functions   # stepDefinitions.HeaderSteps.user_stores_all_header_features_displayed_in_corporate_functions()

    Embedding Getting data from header page of beCognizant portal [image/png 273247 bytes]

  When user click on People                                               # stepDefinitions.HeaderSteps.user_click_on_people()

    Embedding Getting data from header page of beCognizant portal [image/png 288841 bytes]


All features present in People header :
1. People Home
2. Careers
    2.1. Internal Job Moves
    2.2. Performance Management
3. Diversity and Inclusion
    3.1. Affinity Groups & Councils
4. Global Mobility
5. Learning and Development
6. Onboarding
7. Outreach Volunteer Program
8. People Leader Hub
9. People Policies
10. Rewards, Life and Work
    10.1. Benefits and Wellbeing
    10.2. Holiday Schedules
    10.3. Money
    10.4. Recognition (Cheers)
  Then user stores all header features displayed in People                # stepDefinitions.HeaderSteps.user_stores_all_header_features_displayed_in_people()

    Embedding Getting data from header page of beCognizant portal [image/png 238852 bytes]


@sanity @regression
Scenario: Ethics and Compliance Page                                                             # FeatureFiles/f003_ethics.feature:4
  Given user navigates beCognizant portal                                                        # stepDefinitions.ValidationSteps.user_navigates_be_cognizant_portal()

    Embedding Ethics and Compliance Page [image/png 236146 bytes]

  When user clicks on Corporate Function                                                         # stepDefinitions.EthicsAndComplianceSteps.user_clicks_on_Corporate_Function()

    Embedding Ethics and Compliance Page [image/png 256270 bytes]

  Then user hover to Legal & Corporate Affairs                                                   # stepDefinitions.EthicsAndComplianceSteps.user_hover_to_legal_corporate_affairs()

    Embedding Ethics and Compliance Page [image/png 250659 bytes]

  Then user click on Ethics and Compliance                                                       # stepDefinitions.EthicsAndComplianceSteps.user_click_on_Ethics_and_Compliance()

    Embedding Ethics and Compliance Page [image/png 269713 bytes]

Ethics & Compliance page is visible : true
  When Ethics and Compliance page is visible to user                                             # stepDefinitions.EthicsAndComplianceSteps.ethics_and_compliance_page_is_visible_to_user()

    Embedding Ethics and Compliance Page [image/png 132964 bytes]


Director details are displayed below: 
Watts, Allison (Cognizant)
Director
  Then user prints the details of Director                                                       # stepDefinitions.EthicsAndComplianceSteps.user_prints_the_details_of_director()

    Embedding Ethics and Compliance Page [image/png 132964 bytes]


All resources links are displayed below: 
1. Helpline
2. Code of Ethics
3. Global Corporate Policies
4. Ethics & Compliance Policies
5. Ethics & Compliance Ambassadors
6. Ethics & Compliance Program Overview
7. Ethics & Compliance Program Presentation
8. Global Privacy
9. Regulatory & BU Compliance
  Then user prints all the links present in page                                                 
# stepDefinitions.EthicsAndComplianceSteps.user_prints_all_the_links_present_in_page()

    Embedding Ethics and Compliance Page [image/png 132964 bytes]


All details of compliance Program
1. Marc E. Levin
Chief Ethics & Compliance Officer
2. Ethics & Compliance enables Cognizant to succeed…the right way.
3. We enable success by:
4. promoting an ethical culture
5. protecting the company from harm
6. ensuring customer confidence
7. reducing uncertainty in business decisions
8. guarding the company’s reputation
9. We foster a culture with an unwavering commitment to our Core Values & Code of Ethics.
  Then user prints the details of EAC officer along with seven elements of ethics and compliance # stepDefinitions.EthicsAndComplianceSteps.user_prints_the_details_of_eac_officer_along_with_seven_elements_of_ethics_and_compliance()

    Embedding Ethics and Compliance Page [image/png 113995 bytes]

  When user clicks on Ethics and Compliance Risks                                                # stepDefinitions.EthicsAndComplianceSteps.user_clicks_on_ethics_and_compliance_risks()

    Embedding Ethics and Compliance Page [image/png 129697 bytes]


Ethics & Compliance
Risk is an inherent part of conducting business, and especially so on a global scale. Risk can stem from a variety of factors including external factors such as the enforcement landscape, economic conditions or government regulation. It’s critical to understand the compliance risks facing our organization.

Industry / BU-Specific Compliance Risks
1. Health Sciences
2. U.S. Public Sector
3. Insurance

Ethics & Compliance Risks
1. Anti-Corruption
2. Privacy and Data Ethics
3. Immigration
4. Global Trade
5. Environmental Health & Safety
6. Antitrust & Fair Competition
7. Human Rights
8. Lobbying & Political Contributions
9. Intellectual Property & Trade Secrets
10. Conflicts of Interest
11. Emerging Technologies & Markets
12. Social Media
  Then user print all the risks present in the web page                                          # stepDefinitions.EthicsAndComplianceSteps.user_print_all_the_risks_present_in_the_web_page()

    Embedding Ethics and Compliance Page [image/png 137976 bytes]

┌──────────────────────────────────────────────────────────────────────────┐
│ View your Cucumber Report at:                                                                     │
│ https://reports.cucumber.io/reports/eb0e40f3-b9f5-475a-a41d-64782d90d441                          │
│                                                                                                   │
│ This report will self-destruct in 24h.                                                            │
│ Keep reports forever: https://reports.cucumber.io/profile                                         │
└──────────────────────────────────────────────────────────────────────────┘
