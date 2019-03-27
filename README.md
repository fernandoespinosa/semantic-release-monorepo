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