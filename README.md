# :deer: k8s-3tier-webapp

[![Java CI](https://github.com/lodotek/k8s-3tier-webapp/workflows/Java%20CI/badge.svg)](https://github.com/lodotek/k8s-3tier-webapp/actions?query=workflow%3A%22Java+CI%22)
[![Docker Image CI](https://github.com/lodotek/k8s-3tier-webapp/workflows/Docker%20Image%20CI/badge.svg)](https://github.com/lodotek/k8s-3tier-webapp/actions?query=workflow%3A%22Docker+Image+CI%22)
[![Yaml Validator](https://github.com/lodotek/k8s-3tier-webapp/actions/workflows/yaml-validator.yml/badge.svg)](https://github.com/lodotek/k8s-3tier-webapp/actions/workflows/yaml-validator.yml)
[![Minikube CI](https://github.com/lodotek/k8s-3tier-webapp/workflows/Minikube%20CI/badge.svg)](https://github.com/lodotek/k8s-3tier-webapp/actions?query=workflow%3A%22Minikube+CI%22)
[![Minikube Stress CI](https://github.com/lodotek/k8s-3tier-webapp/workflows/Minikube%20Stress%20CI/badge.svg)](https://github.com/lodotek/k8s-3tier-webapp/actions?query=workflow%3A%22Minikube+Stress+CI%22)
[![Minikube Security CI](https://github.com/lodotek/k8s-3tier-webapp/workflows/Minikube%20Security%20CI/badge.svg)](https://github.com/lodotek/k8s-3tier-webapp/actions?query=workflow%3A%22Minikube+Security+CI%22)
[![Check for Update](https://github.com/lodotek/k8s-3tier-webapp/workflows/Check%20for%20Update/badge.svg)](https://github.com/lodotek/k8s-3tier-webapp/actions?query=workflow%3A%22Check+for+Update%22)
[![Dockerfile Lint](https://github.com/lodotek/k8s-3tier-webapp/workflows/Dockerfile%20Lint/badge.svg)](https://github.com/lodotek/k8s-3tier-webapp/actions?query=workflow%3A%22Dockerfile+Lint%22)
[![Check for CI Target](https://github.com/lodotek/k8s-3tier-webapp/workflows/Check%20for%20CI%20Target/badge.svg)](https://github.com/lodotek/k8s-3tier-webapp/actions?query=workflow%3A%22Check+for+CI+Target%22)
![Cypress CI](https://github.com/lodotek/k8s-3tier-webapp/workflows/Cypress%20CI/badge.svg)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/2844382aa110487e94bba8369267476e)](https://www.codacy.com/gh/lodotek/k8s-3tier-webapp/dashboard?utm_source=github.com&utm_medium=referral&utm_content=lodotek/k8s-3tier-webapp&utm_campaign=Badge_Grade)
[![Codacy Badge](https://app.codacy.com/project/badge/Coverage/2844382aa110487e94bba8369267476e)](https://www.codacy.com/gh/lodotek/k8s-3tier-webapp/dashboard?utm_source=github.com&utm_medium=referral&utm_content=lodotek/k8s-3tier-webapp&utm_campaign=Badge_Coverage)
[![CodeFactor](https://www.codefactor.io/repository/github/lodotek/k8s-3tier-webapp/badge)](https://www.codefactor.io/repository/github/lodotek/k8s-3tier-webapp)
[![Maintainability](https://api.codeclimate.com/v1/badges/64a1de96c5eb777b9db1/maintainability)](https://codeclimate.com/github/lodotek/k8s-3tier-webapp/maintainability)
[![codebeat badge](https://codebeat.co/badges/e0bfc464-3370-467d-910f-ade9d83265b1)](https://codebeat.co/projects/github-com-lodotek-k8s-3tier-webapp-master)
[![codecov](https://codecov.io/gh/lodotek/k8s-3tier-webapp/branch/master/graph/badge.svg)](https://codecov.io/gh/lodotek/k8s-3tier-webapp)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=lodotek_k8s-3tier-webapp&metric=alert_status)](https://sonarcloud.io/organizations/lodotek/projects)
[![GuardRails badge](https://api.guardrails.io/v2/badges/lodotek/k8s-3tier-webapp.svg?token=183bc3cc99b96c4703f71d2f839f090a03ce1abb9d3c5ce1babd0ed1a5cf65ff&provider=github)](https://dashboard.guardrails.io/gh/lodotek/73208)
[![Renovate enabled](https://img.shields.io/badge/renovate-enabled-brightgreen.svg?logo=data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9IjAgMCAzNjkgMzY5Ij48Y2lyY2xlIGN4PSIxODkuOSIgY3k9IjE5MC4yIiByPSIxODQuNSIgZmlsbD0iI2ZmZTQyZSIgdHJhbnNmb3JtPSJ0cmFuc2xhdGUoLTUgLTYpIi8+PHBhdGggZmlsbD0iIzhiYjViNSIgZD0iTTI1MSAyNTZsLTM4LTM4YTE3IDE3IDAgMDEwLTI0bDU2LTU2YzItMiAyLTYgMC03bC0yMC0yMWE1IDUgMCAwMC03IDBsLTEzIDEyLTktOCAxMy0xM2ExNyAxNyAwIDAxMjQgMGwyMSAyMWM3IDcgNyAxNyAwIDI0bC01NiA1N2E1IDUgMCAwMDAgN2wzOCAzOHoiLz48cGF0aCBmaWxsPSIjZDk1NjEyIiBkPSJNMzAwIDI4OGwtOCA4Yy00IDQtMTEgNC0xNiAwbC00Ni00NmMtNS01LTUtMTIgMC0xNmw4LThjNC00IDExLTQgMTUgMGw0NyA0N2M0IDQgNCAxMSAwIDE1eiIvPjxwYXRoIGZpbGw9IiMyNGJmYmUiIGQ9Ik04MSAxODVsMTgtMTggMTggMTgtMTggMTh6Ii8+PHBhdGggZmlsbD0iIzI1YzRjMyIgZD0iTTIyMCAxMDBsMjMgMjNjNCA0IDQgMTEgMCAxNkwxNDIgMjQwYy00IDQtMTEgNC0xNSAwbC0yNC0yNGMtNC00LTQtMTEgMC0xNWwxMDEtMTAxYzUtNSAxMi01IDE2IDB6Ii8+PHBhdGggZmlsbD0iIzFkZGVkZCIgZD0iTTk5IDE2N2wxOC0xOCAxOCAxOC0xOCAxOHoiLz48cGF0aCBmaWxsPSIjMDBhZmIzIiBkPSJNMjMwIDExMGwxMyAxM2M0IDQgNCAxMSAwIDE2TDE0MiAyNDBjLTQgNC0xMSA0LTE1IDBsLTEzLTEzYzQgNCAxMSA0IDE1IDBsMTAxLTEwMWM1LTUgNS0xMSAwLTE2eiIvPjxwYXRoIGZpbGw9IiMyNGJmYmUiIGQ9Ik0xMTYgMTQ5bDE4LTE4IDE4IDE4LTE4IDE4eiIvPjxwYXRoIGZpbGw9IiMxZGRlZGQiIGQ9Ik0xMzQgMTMxbDE4LTE4IDE4IDE4LTE4IDE4eiIvPjxwYXRoIGZpbGw9IiMxYmNmY2UiIGQ9Ik0xNTIgMTEzbDE4LTE4IDE4IDE4LTE4IDE4eiIvPjxwYXRoIGZpbGw9IiMyNGJmYmUiIGQ9Ik0xNzAgOTVsMTgtMTggMTggMTgtMTggMTh6Ii8+PHBhdGggZmlsbD0iIzFiY2ZjZSIgZD0iTTYzIDE2N2wxOC0xOCAxOCAxOC0xOCAxOHpNOTggMTMxbDE4LTE4IDE4IDE4LTE4IDE4eiIvPjxwYXRoIGZpbGw9IiMzNGVkZWIiIGQ9Ik0xMzQgOTVsMTgtMTggMTggMTgtMTggMTh6Ii8+PHBhdGggZmlsbD0iIzFiY2ZjZSIgZD0iTTE1MyA3OGwxOC0xOCAxOCAxOC0xOCAxOHoiLz48cGF0aCBmaWxsPSIjMzRlZGViIiBkPSJNODAgMTEzbDE4LTE3IDE4IDE3LTE4IDE4ek0xMzUgNjBsMTgtMTggMTggMTgtMTggMTh6Ii8+PHBhdGggZmlsbD0iIzk4ZWRlYiIgZD0iTTI3IDEzMWwxOC0xOCAxOCAxOC0xOCAxOHoiLz48cGF0aCBmaWxsPSIjYjUzZTAyIiBkPSJNMjg1IDI1OGw3IDdjNCA0IDQgMTEgMCAxNWwtOCA4Yy00IDQtMTEgNC0xNiAwbC02LTdjNCA1IDExIDUgMTUgMGw4LTdjNC01IDQtMTIgMC0xNnoiLz48cGF0aCBmaWxsPSIjOThlZGViIiBkPSJNODEgNzhsMTgtMTggMTggMTgtMTggMTh6Ii8+PHBhdGggZmlsbD0iIzAwYTNhMiIgZD0iTTIzNSAxMTVsOCA4YzQgNCA0IDExIDAgMTZMMTQyIDI0MGMtNCA0LTExIDQtMTUgMGwtOS05YzUgNSAxMiA1IDE2IDBsMTAxLTEwMWM0LTQgNC0xMSAwLTE1eiIvPjxwYXRoIGZpbGw9IiMzOWQ5ZDgiIGQ9Ik0yMjggMTA4bC04LThjLTQtNS0xMS01LTE2IDBMMTAzIDIwMWMtNCA0LTQgMTEgMCAxNWw4IDhjLTQtNC00LTExIDAtMTVsMTAxLTEwMWM1LTQgMTItNCAxNiAweiIvPjxwYXRoIGZpbGw9IiNhMzM5MDQiIGQ9Ik0yOTEgMjY0bDggOGM0IDQgNCAxMSAwIDE2bC04IDdjLTQgNS0xMSA1LTE1IDBsLTktOGM1IDUgMTIgNSAxNiAwbDgtOGM0LTQgNC0xMSAwLTE1eiIvPjxwYXRoIGZpbGw9IiNlYjZlMmQiIGQ9Ik0yNjAgMjMzbC00LTRjLTYtNi0xNy02LTIzIDAtNyA3LTcgMTcgMCAyNGw0IDRjLTQtNS00LTExIDAtMTZsOC04YzQtNCAxMS00IDE1IDB6Ii8+PHBhdGggZmlsbD0iIzEzYWNiZCIgZD0iTTEzNCAyNDhjLTQgMC04LTItMTEtNWwtMjMtMjNhMTYgMTYgMCAwMTAtMjNMMjAxIDk2YTE2IDE2IDAgMDEyMiAwbDI0IDI0YzYgNiA2IDE2IDAgMjJMMTQ2IDI0M2MtMyAzLTcgNS0xMiA1em03OC0xNDdsLTQgMi0xMDEgMTAxYTYgNiAwIDAwMCA5bDIzIDIzYTYgNiAwIDAwOSAwbDEwMS0xMDFhNiA2IDAgMDAwLTlsLTI0LTIzLTQtMnoiLz48cGF0aCBmaWxsPSIjYmY0NDA0IiBkPSJNMjg0IDMwNGMtNCAwLTgtMS0xMS00bC00Ny00N2MtNi02LTYtMTYgMC0yMmw4LThjNi02IDE2LTYgMjIgMGw0NyA0NmM2IDcgNiAxNyAwIDIzbC04IDhjLTMgMy03IDQtMTEgNHptLTM5LTc2Yy0xIDAtMyAwLTQgMmwtOCA3Yy0yIDMtMiA3IDAgOWw0NyA0N2E2IDYgMCAwMDkgMGw3LThjMy0yIDMtNiAwLTlsLTQ2LTQ2Yy0yLTItMy0yLTUtMnoiLz48L3N2Zz4=)](https://app.renovatebot.com/dashboard#github/lodotek/k8s-3tier-webapp)
[![BCH compliance](https://bettercodehub.com/edge/badge/lodotek/k8s-3tier-webapp?branch=master)](https://bettercodehub.com/)
[![Support JVM Version](https://img.shields.io/badge/JVM-11-yellow.svg?style=flat&logo=Java)](https://github.com/lodotek/k8s-3tier-webapp/actions?query=workflow%3A%22Java+CI%22)
[![Support Quarkus Version](https://img.shields.io/badge/Quarkus-1.10-yellow.svg?style=flat&logo=Quarkus)](https://github.com/lodotek/k8s-3tier-webapp/actions?query=workflow%3A%22Java+CI%22)
[![Support Kubernetes Version](https://img.shields.io/badge/Kubernetes-v1.21-yellow.svg?style=flat&logo=Kubernetes)](https://github.com/lodotek/k8s-3tier-webapp/actions?query=workflow%3A%22Minikube+CI%22)
[![Support Minikube Version](https://img.shields.io/badge/Minikube-v1.19-yellow.svg?style=flat&logo=Kubernetes)](https://github.com/lodotek/k8s-3tier-webapp/actions?query=workflow%3A%22Minikube+CI%22)
[![Cypress Dashboard](https://img.shields.io/badge/cypress-dashboard-blue?style=flat&logo=cypress)](https://dashboard.cypress.io/projects/7rgxn6/runs)
[![Gitpod ready-to-code](https://img.shields.io/badge/Gitpod-ready-blue?logo=gitpod)](https://gitpod.io/#https://github.com/lodotek/k8s-3tier-webapp)
[![MDDocs ready](https://img.shields.io/badge/mddocs-ready-blue.svg?style=flat)](https://lodotek.mddocs.io/)
[![MIT License](http://img.shields.io/badge/license-MIT-blue.svg?style=flat)](LICENSE)

---

This is a sample web application based on k8s with a focuse on connecting components, setting up k8s
resources, and deploying microservices. This is for PoC only and not for use in a production environment.

---

| Tier |    Name    |               Description                |
| :--: | :--------: | :--------------------------------------: |
|  1   |  Frontend  | Web page, Application logic, Static file |
|  2   |  Backend   |        Database, Cache, Messaging        |
|  3   | Management |        Monitoring, CI/CD, Tracing        |

![LayardArchitecturalOverview.png](./docs/LayardArchitecturalOverview.png)

## Concepts

- k8s resources defined with yaml manifests
- Test automation utilizing Github Actions
- Automated unit, end-to-end, performance, recovery, & security tests
- Provide monitoring services for observability
- Improve application quality using public CI services

## Features

- All docker components run on k8s
- Utilizes Quarkus, a full-stack, Kubernetes-native, Java App Framework tailored for OpenJDK & GraalVM to ensure a small memory footprint and reduced boot time. 
- k8s resources defined in yaml manifests
- Utilizes only public, non commercial software
- Utilizes Github Actions for build, test, release

## Requirements

Installed CLI commands.

- :computer: docker
- :computer: kubectl
- :computer: minikube

## Run on Minikube

### Mac

```bash
minikube config set memory 121288
minikube config set cpus 6
minikube config set disk-size 80g
minikube start
minikube addons enable ingress
kubectl delete -A ValidatingWebhookConfiguration ingress-nginx-admission

eval $(minikube docker-env)
```

### Windows

```bash
minikube config set memory 121288
minikube config set cpus 6
minikube config set disk-size 80g
minikube start
minikube addons enable ingress
kubectl delete -A ValidatingWebhookConfiguration ingress-nginx-admission

minikube docker-env --shell powershell | Invoke-Expression
```

## Build & Apply

`apply.sh` supports `kubectl apply` to k8s clusters.

```
./kubernetes/bin/apply.sh
```

## Web Console Access

### Add hosts

Add IP, domain in /etc/hosts

```
echo `minikube ip` k8s.3tier.webapp openliberty.minikube spring.minikube api.server.minikube \
rabbitmq.management.minikube jenkins.minikube alertmanager.minikube prometheus.minikube \
grafana.minikube jupyter.minikube hazelcast.manager.minikube activemq.management.minikube \
jaeger.minikube argo.minikube >> /etc/hosts
```

### Web Console list

| Service                     | URL                                   |
| :-------------------------- | :------------------------------------ |
| Top Page                    | <http://k8s.3tier.webapp/>            |
| Open Liberty                | <http://openliberty.minikube>         |
| Spring Boot                 | <http://spring.minikube>              |
| Rabbitmq Management Console | <http://rabbitmq.management.minikube> |
| Activemq Management Console | <http://activemq.management.minikube> |

![top.png](./docs/top.png)

## Component

### Application

Java based web application for [application](application/README.md)

### Kubernetes

Yaml based kubernetes manifests for [kubernetes](kubernetes/README.md)

### Monitoring

Set up [monitoring](kubernetes/monitoring/README.md) for Tier 3

## Contribution

1. [Fork](https://github.com/lodotek/k8s-3tier-webapp/fork) this repo
1. Create a feature branch named like feature/enhancement from
   [master](https://github.com/lodotek/k8s-3tier-webapp/tree/master) branch
1. Commit your changes
1. Rebase your local changes against the
   [master](https://github.com/lodotek/k8s-3tier-webapp/tree/master) branch
1. Create new Pull Request
