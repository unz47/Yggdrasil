# トマト追加要件

## 基本情報
```yaml
アイテムID: tomato
アイテム名（日本語）: トマト
アイテム名（英語）: Tomato
説明: 赤く熟したトマト
```

## 食料特性
```yaml
満腹度回復: 2
隠し満腹度: 0.3

# 参考値（バニラ）
# リンゴ: 4, 0.3
# スイートベリー: 2, 0.1
# ニンジン: 3, 0.6

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
精錬レシピ: なし
```

## テクスチャ
```yaml
テクスチャファイル名: tomato.png
テクスチャパス: textures/item/food/tomato.png
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
対象動物: []
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

上記のトマトを実装してください。

必要なファイル:
1. FoodItems.java - 食料アイテム登録（TOMATO追加）
2. ModCreativeTabs.java - 食料タブに追加
3. assets/yggdrasil/models/item/tomato.json
4. assets/yggdrasil/textures/item/food/tomato.png
5. assets/yggdrasil/lang/ja_jp.json, en_us.json（翻訳追加）

プロジェクト: yggdrasil (Minecraft 1.20.6, Forge 50.2.1)
