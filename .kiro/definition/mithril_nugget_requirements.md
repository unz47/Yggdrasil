# ミスリルナゲット追加要件

## 基本情報
```yaml
アイテムID: mithril_nugget
アイテム名（日本語）: ミスリルナゲット
アイテム名（英語）: Mithril Nugget
説明: ミスリルの小片
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
# レシピ1: 鉱石の精錬
精錬レシピ: あり
レシピタイプ: かまど/溶鉱炉
材料:
  - mithril_ore x 1
結果: mithril_nugget x 1
経験値: 1.2

# レシピ2: インゴットからナゲット
クラフトレシピ1: あり
レシピタイプ: 無形クラフト
材料:
  - mithril_ingot x 1
結果: mithril_nugget x 9

# レシピ3: ナゲットからインゴット
クラフトレシピ2: あり
レシピタイプ: 無形クラフト
材料:
  - mithril_nugget x 9
結果: mithril_ingot x 1
```

## テクスチャ
```yaml
テクスチャファイル名: mithril_nugget.png
テクスチャソース: F:\minecraft mod\misril.png
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
  - 精錬: Yes (mithril_oreから)
  - クラフト: Yes (ミスリルインゴットから)
  - モブドロップ: なし
  - ブロック破壊: なし
  - チェスト戦利品: なし
```

---

## 実装指示

上記のミスリルナゲットを実装してください。

必要なファイル:
1. ModItems.java - アイテム登録
2. assets/yggdrasil/models/item/mithril_nugget.json
3. assets/yggdrasil/lang/ja_jp.json, en_us.json
4. data/yggdrasil/recipes/mithril_nugget_from_ore_smelting.json
5. data/yggdrasil/recipes/mithril_nugget_from_ore_blasting.json
6. data/yggdrasil/recipes/mithril_nugget_from_ingot.json
7. data/yggdrasil/recipes/mithril_ingot_from_nuggets.json
8. assets/yggdrasil/textures/item/mithril_nugget.png (F:\minecraft mod\misril.pngをコピー)

前提: mithril_ore, mithril_ingotが既に実装済み
プロジェクト: yggdrasil (Minecraft 1.20.6, Forge 50.2.1)
