# トウモロコシ追加要件

## 基本情報
```yaml
アイテムID: corn
アイテム名（日本語）: トウモロコシ
アイテム名（英語）: Corn
説明: 食べると満腹度が回復する。焼くと焼きとうもろこしになる。
```

## 食料特性
```yaml
満腹度回復: 2
隠し満腹度: 0.4

# 参考値（バニラ）
# ジャガイモ: 1, 0.3
# ニンジン: 3, 0.6
# パン: 5, 0.6

食べる時間: 通常  # 32tick
常に食べられる: No
```

## ポーション効果
```yaml
効果: なし
```

## スタック設定
```yaml
スタック可能: Yes
最大スタック数: 64
```

## クリエイティブタブ
```yaml
タブ: Yggdrasil_食料
```

## クラフトレシピ
```yaml
クラフトレシピ: なし
```

## 精錬レシピ
```yaml
精錬レシピ: あり

# かまどレシピ
レシピタイプ1: かまど
材料: corn
結果: roasted_corn
経験値: 0.35
精錬時間: 200

# 燻製器レシピ
レシピタイプ2: 燻製器
材料: corn
結果: roasted_corn
経験値: 0.35
精錬時間: 100

# キャンプファイヤーレシピ
レシピタイプ3: キャンプファイヤー
材料: corn
結果: roasted_corn
経験値: 0.35
精錬時間: 600
```

## テクスチャ
```yaml
テクスチャファイル名: corn.png
テクスチャパス: textures/item/food/corn.png
テクスチャサイズ: 16x16
```

## 希少度
```yaml
希少度: Common
```

## 特殊機能
```yaml
右クリック動作: なし
特殊能力: なし
動物の餌: No
食べた時の音: 通常
耐火性: No
```

## 入手方法
```yaml
入手方法:
  - クラフト: No
  - モブドロップ: なし
  - ブロック破壊: なし
  - チェスト戦利品: なし
```

---

## 実装指示

上記のトウモロコシを実装してください。

必要なファイル:
1. FoodItems.java - アイテム登録（CORN追加）
2. ModCreativeTabs.java - 食料タブに追加
3. assets/yggdrasil/models/item/corn.json
4. assets/yggdrasil/textures/item/food/corn.png
5. assets/yggdrasil/lang/ja_jp.json（`item.yggdrasil.corn: トウモロコシ` 追加）
6. assets/yggdrasil/lang/en_us.json（`item.yggdrasil.corn: Corn` 追加）
7. data/yggdrasil/recipes/food/roasted_corn_from_smelting.json（かまど）
8. data/yggdrasil/recipes/food/roasted_corn_from_smoking.json（燻製器）
9. data/yggdrasil/recipes/food/roasted_corn_from_campfire.json（キャンプファイヤー）

前提: roasted_corn（焼きとうもろこし）を別途実装すること
プロジェクト: yggdrasil (Minecraft 1.20.6, Forge 50.2.1)
