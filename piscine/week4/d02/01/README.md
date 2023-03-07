# Initializing a React project without the boilerplate of create-react-app by using webpack and babel


## Base scaffolding
First off we need to create our project folder and initialize the package.json by running these commands
```
mkdir react-webpack
cd react-webpack
npm init -y
```

Now let's create a index.html located in a public folder:
```
mkdir public
touch public/index.html
```

We add the HTML5 boilerplate:
```
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>React + Webpack</title>
</head>
<body>
    <h1>Hello React + Webpack!</h1>
</body>
</html>
```

We can check that our app is working by serving our html page:
```
npx serve public
```

## Adding Webpack
Install Webpack:
```
npm install webpack webpack-cli --save-dev
```

Now let's create a javascript file that Webpack will be bundling:
```
mkdir src
touch src/index.js
```

Add this content to our document:
```
// index.js

const helloDiv = document.createElement("div");
helloDiv.innerHTML = "Hello from Javascript!";
document.body.append(helloDiv);
```

We need to configure webpack:
```
touch webpack.config.js
```

```
// webpack.config.js

const path = require("path");

module.exports = {
  entry: "./src/index.js",
  output: {
    filename: "main.js",
    path: path.resolve(__dirname, "build"),
  },
};
```

Add the build option to our package.json:
```
// package.json
// ...
"scripts": {
    "build": "webpack"
},
```

Add the build and node_modules folders to .gitignore:
```
// .gitignore
build
node_modules
```

Bundle our index.html in the build folder:
```
npm install html-webpack-plugin --save-dev
```

Update the Webpack config:
```
const path = require("path");
const HtmlWebpackPlugin = require("html-webpack-plugin");

module.exports = {
  entry: "./src/index.js",
  output: {
    filename: "main.js",
    path: path.resolve(__dirname, "build"),
  },
  plugins: [
    new HtmlWebpackPlugin({
      template: path.join(__dirname, "public", "index.html"),
    }),
  ],
};
```

We can check it is working:
```
npm run build
npx serve build
```

## Adding Webpack dev server
We install the corresponding package:
```
npm install --save-dev webpack-dev-server
```

And configure it in the Webpack config:
```
{
  // webpack.config.js
  // ...,
  devServer: {
    static: {
      directory: path.join(__dirname, "build"),
    },
    port: 3000,
  }
}
```

Let's add a npm run start script to the package.json:
```
{
  // package.json
  // ...,
  "scripts": {
    "build": "webpack --mode production",
    "start": "webpack serve --mode development"
  }
}
```

Check that it's working:
```
npm run start
```

## Adding Babel
Babel is useful for transpiling all ES6 features to previous JS versions so that all browsers can understand them.

We install the required package:
```
npm i @babel/core @babel/preset-env babel-loader --save-dev
```

And update the Webpack configuration to pass all files to Babel when bundling:
```
{
 // ...,
 module: {
    // exclude node_modules
    rules: [
      {
        test: /\.(js)$/,
        exclude: /node_modules/,
        use: ["babel-loader"],
      },
    ],
  },
  // pass all js files through Babel
  resolve: {
    extensions: ["*", ".js"],
  }
}
```

Then create the Babel config file:
```
touch ..babelrc
```

With the following content
```
// .babelrc

{
  "presets": [
    "@babel/preset-env"
  ]
}
```

Now our app will automatically be transpiled to previous versions of JS if needed.

## Adding React
Now that would not be a React App without React...

Let's install it:
```
npm i react react-dom --save
npm i @babel/preset-react --save-dev
```

Update the .babelrc file to add support for JSX:
```
// .babelrc

{
    "presets": [
      "@babel/preset-env",
      ["@babel/preset-react", {
      "runtime": "automatic"
    }]
    ]
}
```

Note: Specifying the preset-react runtime as automatic allows us to no longer needing importing React on top of each file.

Update the Webpack config:
```
// webpack.config.js

{
  // ...,
  module: {
    // exclude node_modules
    rules: [
      {
        test: /\.(js|jsx)$/,         // <-- added `|jsx` here
        exclude: /node_modules/,
        use: ["babel-loader"],
      },
    ],
  },
  // pass all js files through Babel
  resolve: {
    extensions: ["*", ".js", ".jsx"],    // <-- added `.jsx` here
  },
}
```

Let's create a React component to check that everything is working:
```
touch src/Hello.jsx
```

```
// src/Hello.jsx

const Hello = () => <h1>Hello from React!</h1>;

export default Hello;
```

```
// index.js

import React from "react";
import { createRoot } from "react-dom/client";
import Hello from "./Hello";

const container = document.getElementById("root");
const root = createRoot(container);
root.render(<Hello />);
```

And update our index.html to provide a root node for the app:
```
<!-- index.html -->
<!-- ... -->
<body>
    <div id="root"></div>
</body>
```

Great ! Now let's try it with our dev server:
```
npm run start
```

And in production:
```
npm run build
npx serve build
```

Congratulations, you created a React App with Webpack and Babel !