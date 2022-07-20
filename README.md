# Automation tests for knygos.lt

### Link to the page https://www.knygos.lt/

##### All tests are made on FullHD resolution maximized browser window 

#### 1. Test empty cart
* Open page https://www.knygos.lt/cart
* Get and compare actual empty cart message to expected one
* Get and compare actual cart first step label to expected one
* Get and compare actual cart second step label to expected one
* Get and compare actual cart third step label to expected one
* Get and compare actual cart fourth step label to expected one
* Get and compare actual cart fifth step label to expected one
* Click choose item button to test it

Expected result: Actual empty cart message equals to expected one. Functioning choose item button.

#### 2. Test all books category page
* Open category page https://www.knygos.lt/lt/knygos/zanras/zaislai-ir-zaidimai-vaikams/
* Click in menu "Visos knygos" in the top left corner of the page
* Click menu link "Populiarioji psichologija"
* Compare actual message of "Populiarioji psichologija" to expected one

Expected result: Actual category header message equals to expected one.

#### 3. Test buy without registration error
* Open page https://www.knygos.lt/lt/pirkejas/prisijungti/?next=/user/orders
* Write not existing email in the "El. pašto adresas" field
* Compare actual email message to expected one

Expected result: Get message: This email does not exist.

#### 4. Test search field
* Open page https://www.knygos.lt/
* Enter text "Vasaros romanas" into the *Search* field
* Click *Search* button to find book "Vasaros romanas"
* Compare actual search result message to expected one

Expected result: Search result should return a number of found books.

#### 5. Test search and ddd to cart
* Open page https://www.knygos.lt/
* Enter text "Sodo metai" into the _Search_ field
* Click _Search_ button to find book "Sodo metai"
* Press "Į krepšelį" button on the right of first found book
* Compare actual message to expected on "Prekė sėkmingai įtraukta į krepšelį"

Expected result: First found book added to cart successfully
