Feature: Applicaton Signin

Scenario: ExAssociateConcessionsignin
Given Initialize the browser with chrome
When Vendor Enters LoginDetails "c113797" and "1234" logsin
Then Verify that user sucessfully logged 
Then  contract listing page to display
Then  Able to click addshortTerm

Scenario: ST Com/LT Roving ContractInformation
Given verify Vendor on contractpageInformation 
When VendorenterContractInformtion "03239001" and "3/23/2021"and "5/17/2022"and "0530157100" 
When entersConcessionownerdetails "winsdor" and "walton" and "basanthi.tandle@gmail"and"8324564561"
When entersFaciltynumber "0530157100" and select businessmodel "cashncarryST" and click on AddEvent

Scenario: ADDEVENTS for given ST Com/LT Roving ContractInformation
When enterFirstEventLocationdetails "FORWORT MAINSTREET" and "121221" and "VF0500" and "4/13/2021" and "4/26/2021" and feetype "percentage"
Then DepartmentCategoryabletoaddone "Artposters" and "GamesToys" and  "Jeweleryfine" apply and "56.55" and "32.89" and "65.98"
And EventAssociatesone clickon CopyOwnerDetailsone and click on AddEventsecond.
When enterSecondEventLocationdetails "WALSTREET MAIN" and "45678" and "VF0500" and feetype "percentage"
Then DepartmentCategoryabletoaddsecond "Backpacks" and "BeautySupplies" and  "FashionAccess" apply and "66.55" and "72.89" and "85.98"
And EventAssociatessecond clickon CopyOwnerDetailssecond and click on AddEventsthird.
When enterThirdEventLocationdetails "BENWOOD WALSTREET" and "456456" and "VF0500" and "9/23/2021" and "10/24/2021" and feetype "percentage"
Then DepartmentCategoryabletoaddThird "Backpacks" and "BeautySupplies" and  "FashionAccess" apply and "65.55" and "75.89" and "45.98"
And EventAssociatesthird clickon CopyOwnerDetailsthird and click on Save.

