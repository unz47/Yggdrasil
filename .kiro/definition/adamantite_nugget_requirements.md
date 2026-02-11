# アダマンタイトナゲット追加要件

## 基本情報
```yaml
アイテムID: adamantite_nugget
アイテム名（日本語）: アダマンタイトナゲット
アイテム名（英語）: Adamantite Nugget
説明: アダマンタイトの小片
```

## アイテム特性
```yaml
スタック可能: Yes
最大スタック数: 64
希少度: Common
耐火性: No
発光: No
```

## クリエイティブタブ
```yaml
タブ: Yggdrasil
```

## クラフトレシピ
```yaml
# レシピ1: インゴットからナゲット
クラフトレシピ1: あり
レシピタイプ: 無形クラフト
材料:
  - adamantite_ingot x 1
結果: adamantite_nugget x 9

# レシピ2: ナゲットからインゴット
クラフトレシピ2: あり
レシピタイプ: 無形クラフト
材料:
  - adamantite_nugget x 9
結果: adamantite_ingot x 1
```

## テクスチャ
```yaml
テクスチャファイル名: adamantite_nugget.png
テクスチャパス: assets/yggdrasil/textures/item/metal/adamantite_nugget.png
テクスチャサイズ: 16x16
```

## 特殊機能
```yaml
右クリック動作: なし
特殊能力: なし
燃料として使用可能: No
```

## 入手方法
```yaml
入手方法:
  - クラフト: Yes (アダマンタイトインゴットから)
  - モブドロップ: なし
  - ブロック破壊: なし
  - チェスト戦利品: なし
```

---

## 実装指示

上記のアダマンタイトナゲットを実装してください。

必要なファイル:
1. MetalItems.java - アイテム登録
2. assets/yggdrasil/models/item/adamantite_nugget.json
3. assets/yggdrasil/lang/ja_jp.json, en_us.json
4. data/yggdrasil/recipes/metal/adamantite_nugget_from_ingot.json
5. data/yggdrasil/recipes/metal/adamantite_ingot_from_nuggets.json
6. assets/yggdrasil/textures/item/metal/adamantite_nugget.png

前提: adamantite_ingotが実装済みであること
プロジェクト: yggdrasil (Minecraft 1.20.6, Forge 50.2.1)
