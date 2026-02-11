# アダマンタイトインゴット追加要件

## 基本情報
```yaml
アイテムID: adamantite_ingot
アイテム名（日本語）: アダマンタイトインゴット
アイテム名（英語）: Adamantite Ingot
説明: アダマンタイトの延べ棒
```

## アイテム特性
```yaml
スタック可能: Yes
最大スタック数: 64
希少度: Common
耐火性: Yes
発光: No
```

## クリエイティブタブ
```yaml
タブ: Yggdrasil_雑貨
```

## クラフトレシピ
```yaml
# レシピ1: ナゲットからインゴット
クラフトレシピ1: あり
レシピタイプ: 無形クラフト
材料:
  - adamantite_nugget x 9
結果: adamantite_ingot x 1

# レシピ2: インゴットからナゲット（逆変換）
クラフトレシピ2: あり
レシピタイプ: 無形クラフト
材料:
  - adamantite_ingot x 1
結果: adamantite_nugget x 9
```

## テクスチャ
```yaml
テクスチャファイル名: adamantite_ingot.png
テクスチャパス: textures/item/metal/adamantite_ingot.png
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
  - クラフト: Yes (アダマンタイトナゲット9個から)
  - モブドロップ: なし
  - ブロック破壊: なし
  - チェスト戦利品: なし
```

---

## 実装指示

上記のアダマンタイトインゴットを実装してください。

必要なファイル:
1. MetalItems.java - アイテム登録（ADAMANTITE_INGOT追加）
2. ModCreativeTabs.java - 雑貨タブに追加
3. assets/yggdrasil/models/item/adamantite_ingot.json
4. assets/yggdrasil/lang/ja_jp.json, en_us.json（翻訳追加）
5. assets/yggdrasil/textures/item/metal/adamantite_ingot.png
6. data/yggdrasil/recipes/metal/adamantite_ingot_from_nuggets.json（既存）
7. data/yggdrasil/recipes/metal/adamantite_nugget_from_ingot.json（既存）

前提: adamantite_nuggetが既に実装済み
プロジェクト: yggdrasil (Minecraft 1.20.6, Forge 50.2.1)
