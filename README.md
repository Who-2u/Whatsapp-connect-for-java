# Whatsapp-connect-for-java
With the Cloud API, hosted by Meta, Meta’s integration of the WhatsApp Business Platform, your apps can use WhatsApp to send and receive messages to create an engaging experience for your customers.

Make sure you do the following before you get started:
1. JDK 11 or greater installed
2. Register as a developer at [Meta for Developers](https://developers.facebook.com/micro_site/url/?click_creative_path[0]=link&ums_creative_detail=link%26device_type%3Ddesktop&click_from_context_menu=true&country=IN&destination=https%3A%2F%2Fdevelopers.facebook.com%2F&event_type=click&last_nav_impression_id=0Ag4vgpKq0Wq4yF6y&max_percent_page_viewed=44&max_viewport_height_px=939&max_viewport_width_px=1879&orig_request_uri=https%3A%2F%2Fdevelopers.facebook.com%2Fblog%2Fpost%2F2022%2F11%2F07%2Fadding-whatsapp-to-your-java-projects%2F&region=apac&scrolled=true&session_id=1NQNfBwF8VTdyDMvA&site=developers&extra_data[create_type]=link&extra_data[create_type_detail]=&extra_data[creative_detail]=link%26device_type%3Ddesktop).
3. Ensure your Meta account is linked to a [Meta Business account](https://developers.facebook.com/micro_site/url/?click_creative_path[0]=link&ums_creative_detail=link%26device_type%3Ddesktop&click_from_context_menu=true&country=IN&destination=https%3A%2F%2Fwww.facebook.com%2Fbusiness%2Flearn%2Fhow-business-manager-works%2Fguide&event_type=click&last_nav_impression_id=0Ag4vgpKq0Wq4yF6y&max_percent_page_viewed=44&max_viewport_height_px=939&max_viewport_width_px=1879&orig_request_uri=https%3A%2F%2Fdevelopers.facebook.com%2Fblog%2Fpost%2F2022%2F11%2F07%2Fadding-whatsapp-to-your-java-projects%2F&region=apac&scrolled=true&session_id=1NQNfBwF8VTdyDMvA&site=developers&extra_data[create_type]=link&extra_data[create_type_detail]=&extra_data[creative_detail]=link%26device_type%3Ddesktop).

#Connect cloudAPI to java:

1. Create an app on Meta for Developers. Start by visiting [Meta for Developers](https://developers.facebook.com/micro_site/url/?click_creative_path[0]=link&ums_creative_detail=link%26device_type%3Ddesktop&click_from_context_menu=true&country=IN&destination=https%3A%2F%2Fdevelopers.facebook.com%2F&event_type=click&last_nav_impression_id=0Ag4vgpKq0Wq4yF6y&max_percent_page_viewed=44&max_viewport_height_px=939&max_viewport_width_px=1879&orig_request_uri=https%3A%2F%2Fdevelopers.facebook.com%2Fblog%2Fpost%2F2022%2F11%2F07%2Fadding-whatsapp-to-your-java-projects%2F&region=apac&scrolled=true&session_id=1NQNfBwF8VTdyDMvA&site=developers&extra_data[create_type]=link&extra_data[create_type_detail]=&extra_data[creative_detail]=link%26device_type%3Ddesktop) and clicking My Apps. Then, click Create App and select Business as the app type.

2. Provide the requested details, including the app name and contact email address, and select your business account from the dropdown. Once the app is created, scroll down and click Set up from the WhatsApp card.

3. Now that your app is created in the Meta for Developers console, open VS Code and import the Java project.

4. Some parts of this code need to be replaced with your own details. These are marked with chevrons, like <YOUR PHONE NUMBER ID>. Make sure the number you’re sending a message to includes the country code and is formatted correctly.

5.On the Getting started page in the Meta for Developers console, there’s an example cURL request that provides details about which URL you need to call, the headers you should provide, and an example payload to include as the body. Copy the phone number id from that url and paste it in your code in the place of <YOUR PHONE NUMBER ID>

6. Copy the Authorization token in the next line and paste it in the place of <YOUR BEARER TOKEN>.

7. Provide the target mobile number in the place of <TARGET PHONE NUMBER> to send them the messages, make sure to add and validate the target phone number in the getting started page before using it.

  Incase of queries, write to paneerselvam1157@gmail.com
