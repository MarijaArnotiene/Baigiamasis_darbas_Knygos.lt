# Automation tests for knygos.lt

### Link to the page https://www.knygos.lt/

##### All tests are made on FullHD resolution maximized browser window 

#### 1. Test empty cart
* Open page https://www.knygos.lt/
* Press button accept cookies
* Click "Pirkinių krepšelis" link in the top right corner of the page
* Get and compare actual empty cart message to expected one
* Click choose item button to test it

Expected result: Actual empty cart message equals to expected one. Functioning choose item button.

#### 2. Test fail empty cart
* Open page https://www.knygos.lt/
* Press button accept cookies
* Click "Pirkinių krepšelis" link in the top right corner of the page
* Get and compare actual empty cart message to expected one

Expected result: Actual empty cart message is not equal to expected one. Empty cart test should fail.

#### 3. Test all books page
* Open page https://www.knygos.lt/
* Press button accept cookies
* Click in menu "Visos knygos" in the top left corner of the page
* Click menu link "Populiarioji psichologija"
* Compare actual message of "Populiarioji psichologija" to expected one

Expected result: Actual category header message equals to expected one.

#### 4. Test buy without registration error
* Open page https://www.knygos.lt/
* Press button accept cookies
* Click button "Mano Užsakymai" in the top right corner of the page
* Write not existing email in the "El. pašto adresas" field
* Compare actual email message to expected one

Expected result: Get message: This email does not exist.

#### 5. Test search field
* Open page https://www.knygos.lt/
* Press button accept cookies
* Enter text "Vasaros romanas" into the *Search* field
* Click *Search* button to find book "Vasaros romanas"
* Compare actual search result message to expected one

Expected result: Search result should return a number of found books.

#### 6. Test search and ddd to cart
* Open page https://www.knygos.lt/
* Press button accept cookies
* Enter text "Sodo metai" into the _Search_ field
* Click _Search_ button to find book "Sodo metai"
* Press "Į krepšelį" button on the right of first found book

Expected result: First found book added to cart successfully
