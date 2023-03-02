## 概要

- PR勉強会のJava用リポジトリ
- 使用する場合はforkして使用すること
- ヒント
    - テストは必ずしも正しいわけではないです。

## レビュー対象

- ./src/main/java/com/example/Main.java
- ./test/java/com/example/MainTest.java

## レビュー対象外

- レビュー対象に含めたファイルとディレクトリ以外
- ファイル名、パッケージ名はレビュー対象外

## 実行方法

### 起動準備

```sh
$ make build && make up
```

### コードを実行

```sh
$ make run
```

### テストを実行

```sh
$ make test
```
