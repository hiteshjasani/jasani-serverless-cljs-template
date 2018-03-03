# jasani-serverless-cljs

[![Clojars Project](https://img.shields.io/clojars/v/jasani-serverless-cljs/lein-template.svg)](https://clojars.org/jasani-serverless-cljs/lein-template)

A Leiningen template for an npm serverless function compiled with the Clojurescript compiler.

## Usage

Make sure you have the prerequisites installed.

1. `lein new jasani-serverless-cljs barserver`
2. `lein deps`
3. `.../serverless deploy`

If all goes well, you should see output similar to this:

``` shell
Serverless: Targeting /private/tmp/t/barserver/.serverless/barserver.zip
Serverless: Packaging service...
Serverless: Excluding development dependencies...
Serverless: Executing "lein update-in :cljs-lambda assoc :functions '[{:name "barserver-dev-get" :invoke barserver.core/get}]' -- cljs-lambda build :output /private/tmp/t/barserver/.serverless/barserver.zip :quiet"
Serverless: Returning artifact path /private/tmp/t/barserver/.serverless/barserver.zip
Serverless: Creating Stack...
Serverless: Checking Stack create progress...
.....
Serverless: Stack create finished...
Serverless: Uploading CloudFormation file to S3...
Serverless: Uploading artifacts...
Serverless: Uploading service .zip file to S3 (2.99 MB)...
Serverless: Validating template...
Serverless: Updating Stack...
Serverless: Checking Stack update progress...
.................................
Serverless: Stack update finished...
Service Information
service: barserver
stage: dev
region: us-east-1
stack: barserver-dev
api keys:
  None
endpoints:
  GET - https://b7xwqq8zxb.execute-api.us-east-1.amazonaws.com/dev/get
functions:
  get: barserver-dev-get
```

4. Test your function

```
curl https://b7xwqq8zxb.execute-api.us-east-1.amazonaws.com/dev/get
```

## Prerequisites

* [nodejs & npm](https://nodejs.org/en/)
* [serverless](https://serverless.com/)
* You have an AWS account and [configured credentials](https://docs.aws.amazon.com/cli/latest/userguide/cli-config-files.html)

## Credits

This work builds upon the great work done by:

* [nervous-systems](https://github.com/nervous-systems/serverless-cljs-plugin)
* [serverless](https://serverless.com/)

## License

Copyright © 2018 Hitesh Jasani

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
