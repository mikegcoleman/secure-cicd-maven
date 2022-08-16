# GCP CI/CD security demo and tutorial 
This repo demostrates a security focused CI/CD pipeline for GKE with Google Cloud tools Cloud Build, Binary Authorization, Artifact Registry, Container Analysis, and Google Cloud Deploy. The example app is a simple containerized Maven example app with Kustomize overlays for Kubernetest manifest rendering.

[![Google Cloud Software Supply Chain Security Demo Flow](https://user-images.githubusercontent.com/76225123/170594159-cae11896-5ac1-473c-8d71-924a8d059155.png)](https://user-images.githubusercontent.com/76225123/170594159-cae11896-5ac1-473c-8d71-924a8d059155.png)

## Fork this repo
This demo relies on you making git check-ins to simulate a developer workflow. So you'll need your own copy of these files in your own repo.
To do that in Github use, [fork this repo on Github](https://github.com/vszal/secure-cicd-maven/fork)

Once you've forked, start the tutorial below.

## Setup tutorial - WIP
The following tutorial walks you through all the setup needed to configure Google Cloud services needed to run this demo and then steps you through the demo itself. Clicking this button provisions a Cloud Shell Editor and launches an interactive tutorial which steps you through the process. Google Cloud account and project required.

[![Start tutorial in cloud shell](https://gstatic.com/cloudssh/images/open-btn.svg)](https://ssh.cloud.google.com/cloudshell/open?git_repo=https://github.com/vszal/secure-cicd-maven&cloudshell_workspace=.&cloudshell_tutorial=tutorial.md)

If you don't want to run the tutorial in Cloud Shell, you can view the md file [here](https://github.com/vszal/secure-cicd-maven/blob/main/tutorial.md) although you'll see some artifacts.
