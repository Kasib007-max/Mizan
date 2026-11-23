# MIZAN — Product Vision

## 1. Product Overview

MIZAN (ميزان) is an Android-first personal finance application intended to bring a user's financial activity into one clear, organised view.

It aims to collect transaction information from supported sources, organise spending, help users understand their financial habits, and make shared expenses easier to manage.

MIZAN is being developed initially for personal use, with the longer-term goal of becoming a reliable product that can be made available to other users.

## 2. The Problem

People often use multiple UPI applications, bank accounts, cards, and other payment methods. Their transaction histories are therefore spread across different apps and statements.

This fragmentation can make it difficult to:
- Remember where money was spent.
- Understand total spending across payment sources.
- Identify spending patterns.
- Keep track of shared expenses and repayments.

MIZAN aims to reduce this fragmentation by presenting supported transaction information in one place.

## 3. Intended Users

The initial user is someone who makes payments through multiple digital payment methods and wants a clearer picture of their spending.

The product may later support a broader range of users with different accounts, budgets, and expense-sharing needs.

## 4. Product Goals

1. Provide a unified view of transactions from supported sources.
2. Make transaction records searchable and easy to understand.
3. Categorise expenses while allowing users to correct classifications.
4. Show useful daily, weekly, and monthly spending summaries.
5. Let users create shared expenses and calculate balances between participants.
6. Protect sensitive financial information through privacy-conscious design.
7. Support reliable use when the device is offline, with carefully designed synchronisation where cloud features are enabled.

## 5. Product Principles

- **Privacy first:** Collect only the data needed for a clearly explained feature.
- **User control:** Make transaction sources, permissions, and data handling understandable.
- **Accuracy before automation:** Clearly represent uncertain, pending, or unverified transaction information.
- **Transparency:** Explain how totals and shared balances are calculated.
- **Reliability:** Prevent duplicate records and preserve transaction history.
- **Maintainability:** Prefer modular architecture, tests, and clear documentation.
- **Accessibility:** Keep everyday financial information easy to read and navigate.

## 6. Initial Scope

The first development milestones will focus on:
- Android application foundation.
- Local transaction storage.
- A unified transaction list.
- Manual transaction entry and statement import.
- Transaction categorisation.
- Basic spending summaries.

Automatic transaction collection will be evaluated separately. Android SMS and notification access have permission, privacy, and distribution-policy implications, so no collection method will be adopted until it has been reviewed and tested.

Cloud synchronisation, group expense settlement, and AI-powered insights will follow after the core transaction model is reliable.

## 7. Non-Goals for the Initial Version

The initial version will not:
- Initiate UPI payments or move money.
- Store UPI PINs, banking passwords, or OTPs.
- Claim direct integration with payment apps unless an approved integration exists.
- Treat an SMS or app notification alone as definitive proof that a transaction has settled.
- Provide regulated investment, lending, or tax advice.

## 8. Long-Term Vision

Build a secure and dependable personal finance companion that helps people understand where their money goes, manage shared spending, and make informed everyday financial decisions.

## 9. Current Status

**Stage:** Product definition and technical planning.

This document describes the intended direction. It does not imply that the listed features have already been implemented.
