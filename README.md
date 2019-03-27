# semantic-release-monorepo

## 1

```
➜  semantic-release-monorepo git:(master) ✗ yarn global add semantic-release-cli
yarn global v1.15.2
[1/4] 🔍  Resolving packages...
warning semantic-release-cli > travis-ci > github@0.1.16: 'github' has been renamed to '@octokit/rest' (https://git.io/vNB11)
[2/4] 🚚  Fetching packages...
[3/4] 🔗  Linking dependencies...
[4/4] 🔨  Building fresh packages...

success Installed "semantic-release-cli@4.1.1" with binaries:
      - semantic-release-cli
✨  Done in 16.37s.
➜  semantic-release-monorepo git:(master) ✗ yarn global add lerna
yarn global v1.15.2
[1/4] 🔍  Resolving packages...
[2/4] 🚚  Fetching packages...
[3/4] 🔗  Linking dependencies...
[4/4] 🔨  Building fresh packages...

success Installed "lerna@3.13.1" with binaries:
      - lerna
✨  Done in 11.21s.
➜  semantic-release-monorepo git:(master) ✗ yarn global add create-react-app
yarn global v1.15.2
[1/4] 🔍  Resolving packages...
[2/4] 🚚  Fetching packages...
[3/4] 🔗  Linking dependencies...
[4/4] 🔨  Building fresh packages...

success Installed "create-react-app@2.1.8" with binaries:
      - create-react-app
✨  Done in 3.73s.
```

---

## 2

```
➜  semantic-release-monorepo git:(master) ✗ lerna init
lerna notice cli v3.13.1
lerna info Creating package.json
lerna info Creating lerna.json
lerna info Creating packages directory
lerna success Initialized Lerna files
```

---

## 3

```
yarn add -D react react-dom @babel/core@^7.0.0-0 @babel/cli babel-plugin-transform-es2015-modules-commonjs babel-jest enzyme enzyme-adapter-react-16 jest react-test-renderer babel-core@7.0.0-bridge.0 @babel/preset-env @babel/preset-react
```

---

## 4

```
➜  semantic-release-monorepo git:(master) npx -p @storybook/cli sb init
npx: installed 404 in 22.494s

WARNING: We noticed you're using the `useBuiltIns` option without declaring a core-js version. Currently, we assume version 2.x when no version is passed. Since this default version will likely change in future versions of Babel, we recommend explicitly setting the core-js version you are using via the `corejs` option.

You should also be sure that the version you pass to the `corejs` option matches the version specified in your `package.json`'s `dependencies` section. If it doesn't, you need to run one of the following commands:

  npm install --save core-js@2    npm install --save core-js@3
  yarn add core-js@2              yarn add core-js@3

[BABEL] Note: The code generator has deoptimised the styling of /Users/kapellmeister/.npm/_npx/4629/lib/node_modules/@storybook/cli/node_modules/lodash/lodash.js as it exceeds the max of 500KB.

 sb init - the simplest way to add a storybook to your project. 

 • Detecting project type. ✓
 • Adding storybook support to your "React" app. ✓
 • Preparing to install dependencies. ✓

yarn install v1.15.2
[1/4] 🔍  Resolving packages...
[2/4] 🚚  Fetching packages...
[3/4] 🔗  Linking dependencies...
warning "jest > jest-cli > @jest/core > jest-resolve-dependencies@24.5.0" has unmet peer dependency "jest-resolve@^24.1.0".
warning "jest > jest-cli > jest-config > jest-resolve@24.5.0" has unmet peer dependency "jest-haste-map@^24.0.0".
warning " > babel-loader@8.0.5" has unmet peer dependency "webpack@>=2".
[4/4] 🔨  Building fresh packages...
success Saved lockfile.
✨  Done in 22.38s.

 • Installing dependencies. ✓

To run your storybook, type:

   yarn storybook 

For more information visit: https://storybook.js.org

➜  semantic-release-monorepo git:(master) ✗ 
```