# 通常アイテム追加テンプレート

## 基本情報
```yaml
アイテムID: example_item
アイテム名（日本語）: サンプルアイテム
アイテム名（英語）: Example Item
説明: アイテムの説明
```

## アイテム特性
```yaml
スタック可能: Yes
最大スタック数: 64
希少度: Common  # Common/Uncommon/Rare/Epic
耐火性: No  # 溶岩で燃えないか
発光: No
```

## クリエイティブタブ
```yaml
タブ: 雑貨
```

## クラフトレシピ
```yaml
クラフトレシピ: あり
レシピタイプ: 作業台（有形）

# 有形クラフトパターン
パターン:
  行1: [iron_ingot, iron_ingot, iron_ingot]
  行2: [air, stick, air]
  行3: [air, stick, air]

# または無形クラフト材料
材料:
  - iron_ingot x 3
  - stick x 2
```

## テクスチャ
```yaml
テクスチャファイル名: example_item.png
テクスチャサイズ: 16x16
```

## 特殊機能（任意）
```yaml
右クリック動作: なし
特殊能力: なし
燃料として使用可能: No
燃焼時間: N/A
```

## 入手方法
```yaml
入手方法:
  - クラフト: Yes
  - モブドロップ: なし
  - ブロック破壊: なし
  - チェスト戦利品: なし
```

---

## AIへの指示
```
上記の通常アイテムを実装してください。

必要なファイル:
1. アイテム登録クラス
2. アイテムモデルJSON
3. 言語ファイル（ja_jp.json, en_us.json）
4. クラフトレシピJSON

プロジェクト: yggdrasil (Minecraft 1.20.6, Forge 50.2.1)
```
