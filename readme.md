# Building a Slack chatbot using Mendix to recognize smartphone photos

Conversation UI’s, interacting with applications through smart chat interfaces, is all the hype these days. 
In this blogpost I’ll describe how you can build a smart chatbot using Mendix, the connector kit, and some 
connectors using 3rd party services.

The application that we have built enables people to take images with the Slack app on their mobile phone and ask a 
question to determine what is shown in the image. The Mendix app will recognitize the request and use AWS Rekognition 
to determine what is in the phone taken by the user. The Mendix app will report back to the user with a slack message 
outlining the findings of AWS Rekgnition.

The following is an example conversation from Slack.

 ![Example slack conversation][2]
 
AWS Rekognition can also detect people, faces, age of people, and even emotions.
 
## High-level architecture

The following design illustrates the application architecture. Since this is a chat bot, unlike most Mendix applications, the app doesn’t have many pages. It consists of a number of microflows and connectors which perform the following steps:
1.	Register the app with Slack so we will receive message posted by users,
2.	Receive messages from slack,
3.	Determine the intent of the message, is the user asking for us to recognize items in a photo,
4.	Get the image from the slack channel,
5.	Use AWS Rekognition to label items in the image
6.	Use AWS Rekognition to identify people in the image
7.	Send a message to the user with these findings.

 ![Slack Rekognition bot architecture][1]

## Step by step

Ok, so let’s go through this step by step. First step is to make sure we can receive messages from Slack.

### Register your Mendix app as a Slack bot

To connect to Slack you can use the Slack Connector from the Mendix AppStore. It contains a number of microflow actions, both for receiving and for send messages.

### Receive a slack message

### Use AWS to determine what is in the image

1.	Download image from Slack
2.	Upload image to S3
3.	Call  AWS Rekognition te identify items and people in the image

### Respond to the slack message

 

 [1]: docs/slack-rekognition-architecture.png
 [2]: docs/example-slack-request.png